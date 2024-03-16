package com.damilah.coffeeShop.coffeeShop.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {
    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails mario = User.builder()
                .username("Mario")
                .password("{noop}test123")
                .roles("Admin")
                .build();
        UserDetails mila = User.builder()
                .username("Mila")
                .password("{noop}test123")
                .roles("User")
                .build();
        UserDetails matea = User.builder()
                .username("Matea")
                .password("{noop}test123")
                .roles("USer")
                .build();
        return new InMemoryUserDetailsManager(mario, mila, matea);
    }
}
