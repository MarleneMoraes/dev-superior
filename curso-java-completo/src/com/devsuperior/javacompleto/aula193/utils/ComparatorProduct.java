package com.devsuperior.javacompleto.aula193.utils;

import java.util.Comparator;

import com.devsuperior.javacompleto.aula193.entities.Product;

public class ComparatorProduct implements Comparator<Product> {
	// Comparator objeto de classe separada
	@Override
	public int compare(Product product1, Product product2) {
		return product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase());
	}

}
