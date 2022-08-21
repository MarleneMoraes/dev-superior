package com.devsuperior.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.cursospringboot.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{ }
