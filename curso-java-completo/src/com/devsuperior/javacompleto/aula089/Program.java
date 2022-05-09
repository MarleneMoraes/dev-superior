package com.devsuperior.javacompleto.aula089;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author Marlene 
 * SEÇÃO 10: Comportamento de Memória, arrays, listas 
 * AULA 89.Vetores - Parte 1
 */

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT = %.2f", avg);
		sc.close();
	}

}