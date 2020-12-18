package com.example.demo.repositories

import com.example.demo.models.Orders
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderRepository : JpaRepository<Orders, Long> {
}
