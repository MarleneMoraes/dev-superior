package com.devsuperior.javacompleto.aula091.labs.ex07;

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

		double[] numbers = new double[n];

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Type a number: ");
			numbers[i] = scan.nextDouble();
		}

		double sum = 0.0;
		for (double number : numbers) {
			sum += number;
		}
		
		double avg = sum / n;
		
		System.out.printf("ARRAY AVERAGE = %.3f%n", avg);
		
		System.out.println("BELOW AVERAGE ELEMENTS:");
		for (double number : numbers) {
			if(number < avg) {
				System.out.printf("%.1f%n", number);
			}
		}
		
		scan.close();
	}
}