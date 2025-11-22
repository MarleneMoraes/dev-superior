package com.devsuperior.javacompleto.aula196.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import com.devsuperior.javacompleto.aula196.entities.Product;
import com.devsuperior.javacompleto.aula196.util.ProductPredicate;

/**
 * 
 * @author Marlene 
 * SECAO 18: Programacao Funcional e expressoes lambda 
 * AULA 196. Predicate
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
		list.removeIf(new ProductPredicate());
		
		// REFERENCE METHOD COM METODO ESTATICO
		list.removeIf(Product::staticProductPredicate);
		
		
		// REFERENCE METHOD COM METODO NAO ESTATICO
		list.removeIf(Product::nonStaticProductPredicate);
		
		// EXPRESSAO LAMBDA DECLARADA: variavel tipo Predicate declarada
		double min = 100.0;
		Predicate<Product> predicate = p -> p.getPrice() >= min;
		
		list.removeIf(predicate);
		
		// EXPRESSAO LAMBDA INLINE
		list.removeIf(p -> p.getPrice() >= min);
		
	}
}