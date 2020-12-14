package com.example.demo.models

import javax.persistence.*

@Entity
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
        val firstName: String = "",
        val lastName: String = "",
        val numberPhone: Long = 0,
        val password: String = "",
        @OneToOne
        @JoinColumn(name = "address_id")
        val address: Address? = null
)
