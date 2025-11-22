package com.devsuperior.javacompleto.aula197.util;

import java.util.function.Consumer;

import com.devsuperior.javacompleto.aula197.entities.Product;

public class PriceUpdate implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1); // aumento de 10%		
	}

}
