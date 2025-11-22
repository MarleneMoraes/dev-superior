package com.devsuperior.javacompleto.aula194.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.devsuperior.javacompleto.aula194.entities.Product;

/**
 * 
 * @author Marlene 
 * SECAO 18: Programacao Funcional e expressoes lambda 
 * AULA 194.Programacao Funcional e calculo Lambda
 * 
 */

public class Program {
	public static int globalValue = 3;

	public static void main(String[] args) {
		// TRANSPARENCIA REFERENCIAL

		int[] vect = new int[] { 3, 4, 5 };
		changeOddValues(vect);
		System.out.println(Arrays.toString(vect));

		// FUNCAO DE PRIMEIRA CLASSE
		List<Product> products = new ArrayList<>();

		products.add(new Product("TV", 900.00));
		products.add(new Product("Notebook", 1200.00));
		products.add(new Product("Tablet", 450.00));

		// Na programacao funcional, e possivel passar uma funcao
		// como argumento de outra funcao (objeto de primeira ordem
		// ou primeira classe
		products.sort(Program::compareProducts);

		products.forEach(System.out::println);

		// EXPRESSIVIDADE / CODIGO CONCISO

		List<Integer> numbers = new ArrayList<>();

		Integer sum = 0;
		for (Integer x : numbers) {
			sum += x;
		}
		// Mesmo código em expressao lambda
		// Integer sum = numbers.stream().reduce(0, Integer::sum);

	}

	// O comportamento da funcao depende de um valor externo,
	// o que nao e referencialmente transparente
	public static void changeOddValues(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		}
	}

	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}
}