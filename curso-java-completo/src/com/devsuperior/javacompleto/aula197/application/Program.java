package com.devsuperior.javacompleto.aula197.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import com.devsuperior.javacompleto.aula197.entities.Product;
import com.devsuperior.javacompleto.aula197.util.PriceUpdate;

/**
 * 
 * @author Marlene 
 * SECAO 18: Programacao Funcional e expressoes lambda 
 * AULA 197. Consumer
 * 
 */

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		
		// IMPLEMENTACAO DA INTERFACE
		list.forEach(new PriceUpdate());
		
		
		// REFERENCE METHOD COM METODO ESTATICO
		list.forEach(Product::staticPriceUpdate);
		
		
		// REFERENCE METHOD COM METODO NAO ESTATICO
		list.forEach(Product::nonStaticPriceUpdate);
		
		
		// EXPRESSAO LAMBDA DECLARADA: 
		double factor = 1.1;
		/* Consumer<Product> consumer = p -> {
			p.setPrice(p.getPrice() * factor);
		}; */

		Consumer <Product> consumer = p -> p.setPrice(p.getPrice() * factor);
		list.forEach(consumer);
		
		
		// EXPRESSAO LAMBDA INLINE
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		
		list.forEach(System.out::println);
	}
}