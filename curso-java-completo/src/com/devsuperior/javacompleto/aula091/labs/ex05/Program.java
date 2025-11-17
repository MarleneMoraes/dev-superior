package com.devsuperior.javacompleto.aula091.labs.ex05;

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

		double greater = 0;
		int position = 0;		

		for (int i = 0; i < n; i++) {
				if (numbers[i] > greater) {
					greater = numbers[i];
					position = i; 
				}
		}
		
		System.out.printf("GREATER VALUE = %.1f", greater);
		System.out.printf("%nGREATER VALUE POSITION = %d", position);

		scan.close();
	}
}
