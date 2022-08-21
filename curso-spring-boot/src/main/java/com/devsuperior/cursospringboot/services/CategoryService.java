package com.devsuperior.cursospringboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.cursospringboot.domain.Category;
import com.devsuperior.cursospringboot.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public Category search(Integer id) {
		Category object = repository.findById(id).orElse(null);
		
		return object;
	}
	
	
}
