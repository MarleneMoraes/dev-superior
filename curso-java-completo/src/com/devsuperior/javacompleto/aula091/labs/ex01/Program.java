package com.devsuperior.javacompleto.aula091.labs.ex01;

import java.util.Scanner;

/**
 * 
 * @author Marlene 
 * SECAO 10: Comportamento de Memoria, arrays, listas 
 * AULA 91. Exercicios de fixacao sobre os vetores
 * 
 */

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("How many numbers do you type? ");
		int n = scan.nextInt();

		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Type a number: ");
			numbers[i] = scan.nextInt();
		}

		System.out.println("NEGATIVE NUMBERS:");

		for (int number : numbers) {
			if (number < 0) {
				System.out.println(number);
			}
		}

		scan.close();
	}
}
