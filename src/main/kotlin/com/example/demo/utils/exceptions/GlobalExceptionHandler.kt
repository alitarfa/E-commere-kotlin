package com.example.demo.utils.exceptions

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import java.time.LocalDateTime

@ControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(value = [(ApplicationException::class)])
    fun userHandler(exception: ApplicationException): ResponseEntity<ErrorBuilder> {
        return ResponseEntity.badRequest()
                .body(ErrorBuilder(exception.message, HttpStatus.BAD_REQUEST, LocalDateTime.now()))
    }
}
