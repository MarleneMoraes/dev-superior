package com.orderproduct.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderproduct.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> { }
