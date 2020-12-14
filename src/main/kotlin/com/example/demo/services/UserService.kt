package com.example.demo.services

import com.example.demo.models.User
import com.example.demo.repositories.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    fun registerUser(user: User) = userRepository.save(user)
    fun findUser(id: Long) = userRepository.findById(id)
    fun findUsers() = userRepository.findAll();
    fun deleteUser(id: Long) = userRepository.deleteById(id)
}
