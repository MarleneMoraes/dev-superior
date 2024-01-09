package com.devsuperior.javacompleto.aula245.application;

import java.util.Set;
import java.util.TreeSet;

import com.devsuperior.javacompleto.aula244.entities.Product;

/**
 * 
 * @author Marlene 
 * SECAO 19: Generics, Set, Map 
 * AULA 245. Como TreeSet compara os elementos
 */

public class Program {
	public static void main(String[] args) {
		
		Set<Product> productSet = new TreeSet<>();
		
		productSet.add(new Product("TV", 900.00));
		productSet.add(new Product("Notebook", 1200.00));
		productSet.add(new Product("Tablet", 400.00));
		
		for(Product product : productSet) {
			System.out.println(product); // Caso nao seja implementada o Comparable, dispara a excessao ClassCastException
		}

	}

}
