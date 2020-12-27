package com.example.demo.security

import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService

class CustomUserDetailsService : UserDetailsService {

    override fun loadUserByUsername(p0: String?): UserDetails {
        return CustomUserDetails("");
    }
}
