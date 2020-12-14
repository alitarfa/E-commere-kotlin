package com.example.demo.controller

import com.example.demo.models.User
import com.example.demo.services.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class Controller(private val userService: UserService) {

    @PostMapping("/register")
    fun register(user: User): ResponseEntity<User> {
        val registerUser = userService.registerUser(user)
        return ResponseEntity.ok(registerUser)
    }
}
