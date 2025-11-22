package com.devsuperior.javacompleto.aula200;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

/**
 * 
 * @author Marlene 
 * SECAO 18: Programacao Funcional e expressoes lambda 
 * AULA 200. Stream
 * 
 */

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

		// Stream<Integer> streamInteger = list.stream();
		Stream<Integer> streamInteger = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(streamInteger.toArray()));

		Stream<String> streamString = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(streamString.toArray()));
		
		Stream<Integer> streamLimit = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(streamLimit.limit(10).toArray()));
		
		// Sequencia de Fibonacci
		Stream<Long> streamFibonacci = Stream.iterate(new Long[] { 0L, 1L }, p -> new Long[] { p[1], p[0] + p[1] })
				.map(p -> p[0]);
		 
		 System.out.println(Arrays.toString(streamFibonacci.limit(10).toArray()));
	}
}