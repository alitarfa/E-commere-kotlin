package com.example.demo.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Address(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
        var houseNumber: Int = 0,
        var street: String = "",
        var city: String = "",
        var country: String = ""
)
