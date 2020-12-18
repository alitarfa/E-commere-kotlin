package com.example.demo.models

import javax.persistence.*

@Entity
data class ProductDetails(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = 0,
        @ManyToOne
        var product: Product? = null,
        var size: String? = "",
        var color: String? = ""
)
