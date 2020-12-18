package com.example.demo.controller

import com.example.demo.models.User
import com.example.demo.services.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserProfile(private val userService: UserService) {

    @PostMapping("/register")
    fun register(@RequestBody user: User): ResponseEntity<User> {
        return with(userService.registerUser(user)) {
            ResponseEntity.ok(this)
        }
    }

    @PutMapping("/profile")
    fun updateProfile(@RequestBody user: User): ResponseEntity<User> {
        return with(userService.updateUserProfile(user)) {
            ResponseEntity.ok(this)
        }
    }

}
