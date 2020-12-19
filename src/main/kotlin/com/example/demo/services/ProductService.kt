package com.example.demo.services

import com.example.demo.models.Product
import com.example.demo.repositories.ProductRepository
import com.example.demo.utils.exceptions.ApplicationException
import org.springframework.stereotype.Service

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
                    with(product) {
                        it.name = name
                        it.description = description
                        it.price = price
                        productRepository.save(it)
                    }
                }.orElseThrow { throw ApplicationException("error.product.notfound") }
    }

    fun delete(id: Long) {
        productRepository.deleteById(id)
    }
}
