package com.devsuperior.javacompleto.aula091.labs.ex02;

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

		double[] numbers = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Type a number: ");
			numbers[i] = scan.nextDouble();
		}

		double sum = 0.0; 
		
		System.out.print("VALUES = ");

		for (double number : numbers) {
				System.out.printf("%.2f ", number);
				sum += number;
		}
		
		System.out.printf("%nSUM = %.2f", sum);
		
		System.out.printf("%nAVG = %.2f", (sum/n));

		scan.close();
	}
}
