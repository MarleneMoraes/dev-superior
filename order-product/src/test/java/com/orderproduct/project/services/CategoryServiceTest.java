package com.orderproduct.project.services;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.orderproduct.project.entities.Category;
import com.orderproduct.project.entities.Product;
import com.orderproduct.project.repositories.CategoryRepository;

public class CategoryServiceTest {
	
	@Autowired
	private CategoryRepository repository;

	private List<Category> categories;
	private Set<Product> products;

	@BeforeEach
	public void Contructor() {
		categories.add(new Category(null, "Electronics"));
		categories.add(new Category(null, "Clothes"));
		categories.add(new Category(null, "Home and Kitchen"));
		categories.add(new Category(null, "Sport"));
		categories.add(new Category(null, "Beauty"));
		categories.add(new Category(null, "Automotive"));
		categories.add(new Category(null, "Toys and Games"));
		categories.add(new Category(null, "Tools and Home Improvement"));

		products.add(new Product(null, "Smartphone", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", 999.99,
				"https://example.com/smartphone.jpg"));
		products.add(new Product(null, "T-shirt", "Nulla eu imperdiet purus. Maecenas ante.", 19.99,
				"https://example.com/tshirt.jpg"));
		products.add(new Product(null, "Coffee Maker", "Donec aliquet odio ac rhoncus cursus.", 49.99,
				"https://example.com/coffeemaker.jpg"));
		products.add(new Product(null, "Laptop", "Nam eleifend maximus tortor, at mollis.", 1299.99,
				"https://example.com/laptop.jpg"));
		products.add(new Product(null, "Sofa", "Cras fringilla convallis sem vel faucibus.", 599.99,
				"https://example.com/sofa.jpg"));
		products.add(new Product(null, "Running Shoes",
				"Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.", 79.99,
				"https://example.com/runningshoes.jpg"));
		products.add(new Product(null, "Shampoo", "Fusce consequat ligula nec mi varius, at ultricies mauris lacinia.",
				9.99, "https://example.com/shampoo.jpg"));
		products.add(new Product(null, "Car Battery", "Integer eu libero commodo, interdum arcu eget, hendrerit justo.",
				89.99, "https://example.com/carbattery.jpg"));
		products.add(new Product(null, "Board Game", "Vestibulum vel est eu nulla laoreet vestibulum.", 24.99,
				"https://example.com/boardgame.jpg"));
		products.add(new Product(null, "Vitamin C Supplement", "Curabitur at magna sit amet sem euismod posuere.",
				14.99, "https://example.com/vitaminc.jpg"));
		products.add(new Product(null, "Novel", "Sed condimentum urna a nunc luctus, eget malesuada libero gravida.",
				12.99, "https://example.com/novel.jpg"));
		products.add(new Product(null, "Drill Set", "Vivamus ut est non magna semper auctor.", 79.99,
				"https://example.com/drillset.jpg"));
		products.add(new Product(null, "Bedding Set",
				"Quisque lobortis velit nec leo aliquam, id posuere justo consectetur.", 39.99,
				"https://example.com/beddingset.jpg"));
	}

	@Test
	public void testFindAll() {
	    categories = repository.findAll();
	    assertNotNull(categories);
	    assertFalse(categories.isEmpty());
	}
	
	@Test
	public void testFindById(Long id) {
		Optional<Category> category = repository.findById(id);
		if(category.isEmpty()) {
			assertNull(category);
		} else {
			category.get();			
		}
	}
}
