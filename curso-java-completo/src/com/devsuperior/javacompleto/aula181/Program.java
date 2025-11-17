package com.devsuperior.javacompleto.aula181;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Marlene 
 * SECAO 17: Generics, Set, Map 
 * AULA 181. Tipos curinga
 * 
 */

public class Program {
	public static void main(String[] args) {
		// Generics sao invariantes
		// List<Object> nao e o supertipo de qualquer tipo de lista

		// List<Object> objects = new ArrayList<>();
		List<?> objects = new ArrayList<>(); // tipo curinga
		List<Integer> numbers = Arrays.asList(5, 2, 10);

		objects = numbers; // type mismatch - erro de compilacao com List<Object>

		printList(numbers);

		List<String> strings = Arrays.asList("Maria", "Alex", "Bob");
		printList(strings);

		// Listas tipo curinga nao podem adicionar dados a esta lista

	}

	private static void printList(List<?> list) {
		for (Object item : list) {
			System.out.println(item);
		}
	}
}
