package com.example.demo.repositories

import com.example.demo.models.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
    fun findByNumberPhone(numberPhone: Long): User?;
}
