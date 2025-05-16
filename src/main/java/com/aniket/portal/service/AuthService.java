package com.aniket.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.aniket.portal.model.UserModel;
import com.aniket.portal.repository.UserRepository;


@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository; // Assuming you have a UserRepository for DB interactions

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void register(UserModel user) {
        // Encode the password before saving to the database
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepository.save(user);
    }

    public boolean login(String username, String password) {
    	UserModel user = userRepository.findByUsername(username);
        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            return true; // Successful login
        }
        return false; // Login failed
    }
}
