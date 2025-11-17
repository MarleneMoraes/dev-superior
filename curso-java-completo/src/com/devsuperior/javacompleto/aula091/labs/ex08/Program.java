package com.devsuperior.javacompleto.aula091.labs.ex08;

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

		System.out.print("How many elements ​​will the array have? ");
		int n = scan.nextInt();

		int[] numbers = new int[n];

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Type a number: ");
			numbers[i] = scan.nextInt();
		}

		double sum = 0;
		for (int number : numbers) {
			if(number % 2 == 0) {
				sum += number;
			}
		}
				
		if(sum > 0) {
			double avg = sum / n;
			System.out.printf("EVEN AVERAGE = %.1f", avg);			
		} else {
			System.out.println("NO EVEN NUMBERS");			
		}		
		
		scan.close();
	}
}