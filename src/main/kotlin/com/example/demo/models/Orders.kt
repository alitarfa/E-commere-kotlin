package com.example.demo.models

import javax.persistence.*

@Entity
data class Orders(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        val orderReference: String = "",
        @OneToOne
        val user: User? = null,
        @OneToOne
        var address: Address? = null,
        var status: OrderStatus? = null,
)
