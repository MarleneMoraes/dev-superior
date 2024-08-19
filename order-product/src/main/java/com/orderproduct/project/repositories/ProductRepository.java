package com.orderproduct.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderproduct.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> { }
