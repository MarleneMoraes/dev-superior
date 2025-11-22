package com.devsuperior.javacompleto.aula193.application;

import java.util.ArrayList;
import java.util.List;

import com.devsuperior.javacompleto.aula193.entities.Product;

/**
 * 
 * @author Marlene 
 * SECAO 18: Programacao Funcional e expressoes lambda 
 * AULA 193. Uma experiencia com Comparator 
 */

public class Program {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("TV", 900.00));
		products.add(new Product("Notebook", 1200.00));
		products.add(new Product("Tablet", 450.00));
		
		// INTERFACE FUNCIONAL
		// products.sort(new ComparatorProduct());

		/* Comparator objeto de classe anonima
		
		Comparator<Product> comparator = new Comparator<Product>() {

			@Override
			public int compare(Product product1, Product product2) {
				return product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase());
			}
			
		};
		
		products.sort(comparator);
		
		*/
		
		/* Expressoes lambda (arrow function): funcao anonima
		 * parametros -> { return implementacao }
		 * parametros -> implementacao
		
		Comparator<Product> comparator = (product1, product2) -> 
			product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase());
	
		
		products.sort(comparator);
		*/

		// Comparator expressao lambda "direto no argumento"
		products.sort((product1, product2) -> 
			product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase()));
		
		
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
