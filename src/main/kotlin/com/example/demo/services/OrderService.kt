package com.example.demo.services

import com.example.demo.models.Orders
import com.example.demo.repositories.OrderRepository
import org.springframework.stereotype.Service

@Service
class OrderService(private val orderRepository: OrderRepository) {
}
