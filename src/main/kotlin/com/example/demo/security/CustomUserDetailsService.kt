package com.example.demo.security

import com.example.demo.repositories.UserRepository
import com.example.demo.utils.exceptions.ApplicationException
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class CustomUserDetailsService(private val userRepository: UserRepository) : UserDetailsService {

    override fun loadUserByUsername(numberPhone: String?): UserDetails {
        var user = userRepository.findByNumberPhone(numberPhone = numberPhone?.toLong()!!)
                ?: throw ApplicationException("error.user.notfound")
        return CustomUserDetails(user.lastName, user.pass!!);
    }
}
