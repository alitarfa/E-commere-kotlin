package com.example.demo.models

import javax.persistence.*

@Entity
data class Product(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
        var name: String = "",
        var description: String = "",
        var price: Float = 0F,
        var video: String = "",
        @OneToMany
        var productDetails: List<ProductDetails> = listOf()
)
