// SecurityConfig.java
package com.aniket.portal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig  {

	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(authorize -> authorize
            	.antMatchers("/js/*").permitAll()
            	.antMatchers("/css/*").permitAll()
                .antMatchers("/register").permitAll()
                .antMatchers("/images/*").permitAll()
                .antMatchers("/registration").permitAll()
                .antMatchers("//api/auth/*").permitAll()
                .antMatchers("/home").permitAll()
                .antMatchers("/login").permitAll()
                .antMatchers("/adminLogin").permitAll()
                .antMatchers("/userLogin").permitAll()
                .antMatchers("/index").permitAll()
                .antMatchers("/singleregisterbus").permitAll()
                .antMatchers("/schedulebus").permitAll()
                .antMatchers("/customerseatbooking").permitAll()
                .antMatchers("/fetchbusseatdetails").permitAll()
                .antMatchers("/allocateseats").permitAll()
                .antMatchers("/fetchbusdetails").permitAll()
                .antMatchers("/fetchuncompletedtrips").permitAll()
                .antMatchers("/fetchcompletedtrips").permitAll()
                .antMatchers("/checkusername").permitAll()
                .antMatchers("/fetchpdf/*").permitAll()
                .anyRequest().authenticated()
            )
            .csrf(csrf -> csrf
                .disable() // Disable CSRF for stateless APIs
            ); // Use default form login configuration

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
