package com.example.demo.controller

import com.example.demo.services.OrderService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/finder")
class OrderController(private val orderService: OrderService) {

}
