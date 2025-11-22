package com.devsuperior.javacompleto.aula199.services;

import java.util.List;
import java.util.function.Predicate;

import com.devsuperior.javacompleto.aula199.entities.Product;

public class ProductService {

	public double filteredSum(List<Product> products, Predicate<Product> criteria) {
		double sum = 0.0;

		for (Product product : products) {
			if (criteria.test(product)) {
				sum += product.getPrice();
			}
		}
		
		return sum;
	}

}
