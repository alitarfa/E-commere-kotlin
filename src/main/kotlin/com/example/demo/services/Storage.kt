package com.example.demo.services

interface Storage {
    fun upload(): String
    fun download(): List<Byte>
    fun delete(): Boolean
}
