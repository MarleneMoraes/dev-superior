package com.devsuperior.javacompleto.aula196.util;

import java.util.function.Predicate;

import com.devsuperior.javacompleto.aula196.entities.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}

}
