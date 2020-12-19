package com.example.demo.utils.exceptions

import org.springframework.http.HttpStatus
import java.time.LocalDateTime

data class ErrorBuilder(
        val message: String?,
        val status: HttpStatus,
        val timestamp: LocalDateTime
)
