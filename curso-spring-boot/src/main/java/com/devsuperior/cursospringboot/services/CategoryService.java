package com.devsuperior.cursospringboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.cursospringboot.domain.Category;
import com.devsuperior.cursospringboot.repositories.CategoryRepository;
import com.devsuperior.cursospringboot.services.exceptions.ObjectNotFoundException;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public Category search(Integer id) {
		Optional<Category> object = repository.findById(id);
		
		return object.orElseThrow(() -> new ObjectNotFoundException
				("Objeto não encontrado! Id: " + id + " | Tipo: " 
						+ Category.class.getName()));
	}
	
	
}
