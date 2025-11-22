package com.devsuperior.javacompleto.aula201;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author Marlene 
 * SECAO 18: Programacao Funcional e expressoes lambda 
 * AULA 201. Pipeline (demo)
 * 
 */

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Integer> numbers = Arrays.asList(3, 4, 5, 10, 7);

		Stream<Integer> streamInteger = numbers.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(streamInteger.toArray()));
		
		int sum = numbers.stream().reduce(0, (x, y) -> x + y);
		// int prod = list.stream().reduce(1, (x, y) -> x * y);
		
		System.out.println("Sum = " + sum);

		// PIPELINE
		
		List<Integer> list = numbers.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		
		System.out.println(Arrays.toString(list.toArray()));
	}
}