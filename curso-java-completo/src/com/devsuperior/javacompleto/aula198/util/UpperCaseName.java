package com.devsuperior.javacompleto.aula198.util;

import java.util.function.Function;

import com.devsuperior.javacompleto.aula198.entities.Product;

public class UpperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
