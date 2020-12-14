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
        val houseNumber: Int = 0,
        val street: String = "",
        val city: String = "",
        val country: String = ""
)
