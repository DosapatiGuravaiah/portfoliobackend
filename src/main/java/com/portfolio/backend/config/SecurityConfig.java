package com.portfolio.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.cors()  // Enable CORS support
            .and()
            .csrf().disable()  // Disable CSRF if not using it
            .authorizeRequests()
            .requestMatchers("/api/stocks/**").permitAll()  // Allow access to /api/stocks without authentication
            .anyRequest().authenticated();  // Secure other endpoints (if needed)
        return http.build();
    }
}
