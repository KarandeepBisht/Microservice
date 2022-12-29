package com.example.Microservice.repository;

import com.example.Microservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public class ProductRepository extends JpaRepository<Product, Long> {
}
