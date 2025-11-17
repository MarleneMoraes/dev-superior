package com.devsuperior.javacompleto.aula185.application;

import java.util.HashSet;
import java.util.Set;

import com.devsuperior.javacompleto.aula185.entities.Product;

/**
 * 
 * @author Marlene 
 * SECAO 17: Generics, Set, Map 
 * AULA 185. Como Set testa igualdade
 */

public class Program {
	public static void main(String[] args) {
		// Caso o hashCode e equals estiverem implementados,
		// sera verificado pelo hashCode e, em caso de igualdade,
		// utiliza equals para confirmar
		// Caso nao, sera comparado as referencias (ponteiros) 
		// dos objetos
		
		
		Set<Product> productSet = new HashSet<>();
		
		productSet.add(new Product("TV", 900.00));
		productSet.add(new Product("Notebook", 1200.00));
		productSet.add(new Product("Tablet", 400.00));
		
		Product product = new Product("Notebook", 1200.00);
		
		System.out.println(productSet.contains(product)); // true, caso esteja implementado o hashCode e equals
		
		
	}

}
