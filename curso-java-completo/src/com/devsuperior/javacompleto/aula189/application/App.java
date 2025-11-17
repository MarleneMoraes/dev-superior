package com.devsuperior.javacompleto.aula189.application;

import java.util.HashMap;
import java.util.Map;

import com.devsuperior.javacompleto.aula189.entities.Product;

public class App {
	public static void main(String[] args) {
		Map<Product, Double> stock = new HashMap<>();

		Product[] products = { new Product("Tv", 900.0), 
							   new Product("Notebook", 1200.0),
							   new Product("Tablet", 400.0) };

		stock.put(products[0], 10000.0);
		stock.put(products[1], 20000.0);
		stock.put(products[2], 15000.0);

		Product product = new Product("Tv", 900.0);

		System.out.println("Contains 'product' key: " + stock.containsKey(product));
	}
}
