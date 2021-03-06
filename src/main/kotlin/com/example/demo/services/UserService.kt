package com.example.demo.services

import com.example.demo.models.User
import com.example.demo.repositories.UserRepository
import com.example.demo.utils.exceptions.ApplicationException
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(private val userRepository: UserRepository) {

    fun registerUser(user: User): User {
        return userRepository.findByNumberPhone(user.numberPhone)
                ?.let { throw ApplicationException("error.user.phone.duplication") }
                ?: return userRepository.save(user)
    }

    fun updateUserProfile(user: User): User {
        return userRepository.findById(user.id!!)
                .map {
                    with(user) {
                        it.firstName = firstName;
                        it.lastName = lastName;
                        it.address = address
                        it.numberPhone = numberPhone
                        userRepository.save(it)
                    }
                }
                .orElseThrow { throw ApplicationException("error.user.notfound") }
    }
}
