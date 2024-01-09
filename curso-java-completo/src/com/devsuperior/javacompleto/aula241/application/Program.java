package com.devsuperior.javacompleto.aula241.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Marlene 
 * SECAO 19: Generics, Set, Map 
 * AULA 241. Curingas delimitados
 */

public class Program {
	public static void main(String[] args) {
		// Principio get/put
		// covariancia - permite acessar (get) mas nao permite adicionar (put)
		List<Integer> integers = new ArrayList<>();
		integers.add(10);
		integers.add(5);
		
		List<? extends Number> list = integers;
		Number x = list.get(0); // ok!
		// list.add(20); // erro de compilacao, pois a lista curinga 
						 // nao sabe se aquele tipo e compativel 
		
		
		// contravariancia - permite adicionar mas nao acessar
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
