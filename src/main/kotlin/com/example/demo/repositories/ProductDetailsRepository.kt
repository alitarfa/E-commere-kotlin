package com.example.demo.repositories

import com.example.demo.models.ProductDetails
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductDetailsRepository : JpaRepository<ProductDetails, Long> {
}
