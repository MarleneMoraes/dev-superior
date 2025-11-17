package com.devsuperior.javacompleto.aula182.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Marlene 
 * SECAO 17: Generics, Set, Map 
 * AULA 182. Curingas delimitados
 */

public class Program {
	public static void main(String[] args) {
		// Principio get/put
		// COVARIANCIA - permite acessar (get) mas nao permite adicionar (put)
		// pelo compilador nao saber se o tipo adicionado e compativel com o 
		// tipo mais generico 
		
		List<Integer> integers = new ArrayList<>();
		integers.add(10);
		integers.add(5);
		
		List<? extends Number> list = integers;
		Number x = list.get(0); // ok!
		// list.add(20); // erro de compilacao, pois a lista curinga 
						 // nao sabe se aquele tipo e compativel 
		
		
		// CONTRAVARIANCIA - permite adicionar (put) mas nao acessar (get)
		List<Object> objects = new ArrayList<>();
		objects.add("Maria");
		objects.add("Alex");
		
		// <? super Number> - qualquer tipo que seja superclasse de Number,
		// delimitando os tipos 
		List<? super Number> numbers = objects;
		numbers.add(10); // ok!
		numbers.add(3.14);// ok!
		
		// x = numbers.get(0); // erro de compilacao, pois essa variavel e Number 
							   // e o elemento pode ser um supertipo de Number
		
		// Exemplo
		List<Integer> ints = Arrays.asList(1, 2, 3, 4);
		List<Double> doubs = Arrays.asList(3.14, 6.28);
		List<Object> objs = new ArrayList<>();
		
		copy(ints, objs);
		copy(doubs, objs);
		
		printList(objs);
		
	}

	// Covariancia: List<? extends Number> source 
	// Contravariancia: List<? super Number> destiny
	private static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for(Number number : source) {
			destiny.add(number);
		}	
	}
	
	public static void printList(List<?> list) {
		for(Object object : list) {
			System.out.print(object + " ");
		}
		
		System.out.println();
	}

}
