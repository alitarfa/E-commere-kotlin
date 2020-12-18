package com.example.demo

fun main() {
    // the Optional in Kotlin

    val present: String? = null
    val b = present?.let { true } ?: false
    println(b)
}
