package com.example.demo.services

import com.example.demo.models.Product
import com.example.demo.repositories.ProductRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductService(private val productRepository: ProductRepository) {

    fun create(product: Product): Product {
        with(productRepository.save(product)) {
            return this;
        }
    }

    fun update(product: Product): Product {
        return productRepository.findById(product.id)
                .map {
                    with(it) {
                        it.name = name
                        it.description = description
                        it.price = price
                        it
                    }
                }
                .let(Optional<Product>::get)
                .let(productRepository::save)
    }
}
