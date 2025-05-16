// AuthController.java
package com.aniket.portal.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.aniket.portal.model.RoleModel;
import com.aniket.portal.model.UserModel;
import com.aniket.portal.pojos.UserRegistrationRequest;
import com.aniket.portal.repository.RoleRepository;
import com.aniket.portal.service.UserService;


@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private RoleRepository roleRepository;
    
    Map<String, String> response = new HashMap<>();
    @PostMapping("/register")
    public ResponseEntity<Map<String, String>>  register(@RequestBody UserRegistrationRequest request) {
    	
        // Fetch the role by its name
        RoleModel role = roleRepository.findByName(request.getRoleName());
        if (role == null) {
            throw new RuntimeException("Role not found with name: " + request.getRoleName());
        }

        // Create a new UserModel
        UserModel user = new UserModel();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setRole(role);  // Set the fetched role
        // Register the user
        userService.registerUser(request.getUsername(),request.getPassword(),request.getRoleName());
        
        response.put("message", "Registration successful");

        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody UserModel user) {
        UserModel existingUser = userService.findByUsername(user.getUsername());
        if (existingUser != null && passwordEncoder.matches(user.getPassword(), existingUser.getPassword())) {
        	response.put("role",existingUser.getRole().getName());
        	response.put("message", "Login successful");
            return ResponseEntity.ok(response);
        } else {
        	response.put("message", "Invalid username or password");
            return ResponseEntity.ok(response);
        }
    }
}
