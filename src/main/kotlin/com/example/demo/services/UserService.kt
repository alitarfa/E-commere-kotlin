package com.example.demo.services

import com.example.demo.models.User
import com.example.demo.repositories.UserRepository
import com.example.demo.utils.UserException
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(private val userRepository: UserRepository) {

    fun registerUser(user: User): User {
        return userRepository.findByNumberPhone(user.numberPhone)
                ?.let { throw UserException("error.user.phone.duplication") }
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
                        it
                    }
                }
                .let(Optional<User>::get)
                .let { userRepository.save(it) }
    }
}
