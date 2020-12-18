package com.example.demo.utils

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import java.time.LocalDateTime

@ControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(value = [(UserException::class)])
    fun userHandler(exception: UserException): ResponseEntity<ErrorBuilder> {
        return ResponseEntity.badRequest()
                .body(ErrorBuilder(exception.message, HttpStatus.BAD_REQUEST, LocalDateTime.now()))
    }
}
