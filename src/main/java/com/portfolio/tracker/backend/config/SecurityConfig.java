package com.portfolio.tracker.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import io.micrometer.core.ipc.http.HttpSender.Request;

@Configuration
@EnableWebSecurity(debug = true)
public class SecurityConfig {
	@Bean
	public SecurityFilterChain configuration(HttpSecurity http) throws Exception{
		http.csrf(cors -> cors.disable());
		http.authorizeHttpRequests(
				request -> request.anyRequest().permitAll()
		);
		return http.build();
	}
	
}
