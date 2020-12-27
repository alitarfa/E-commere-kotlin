package com.example.demo.models

import javax.persistence.*

@Entity
open class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        var firstName: String = "",
        var lastName: String = "",
        @JoinColumn(unique = true)
        var numberPhone: Long = 0,
        var pass: String? = null,
        @OneToOne
        @JoinColumn(name = "address_id")
        var address: Address? = null,
        var userType: UserType? = null
)
