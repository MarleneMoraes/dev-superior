package com.devsuperior.cursospringboot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.cursospringboot.domain.Category;
import com.devsuperior.cursospringboot.repositories.CategoryRepository;

@SpringBootApplication
public class CursoSpringBootApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursoSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category category1 = new Category(null, "Informática");
		Category category2 = new Category(null, "Escritório");
		
		repository.saveAll(Arrays.asList(category1, category2));
		
	}

}
