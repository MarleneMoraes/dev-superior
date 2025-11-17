package com.devsuperior.javacompleto.aula091.labs.ex06;

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

		System.out.print("How many values ​​will each array have? ");
		int n = scan.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];

		System.out.println("Enter the values ​​for vector A:");
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		
		System.out.println("Enter the values ​​for vector B:");
		for (int i = 0; i < b.length; i++) {
			b[i] = scan.nextInt();
		}


		int[] c = new int[n];
		System.out.println("RESULTANT VECTOR:");

		for (int i = 0; i < c.length; i++) {
				c[i] = a[i] + b[i];
				System.out.println(c[i]);
		}
		scan.close();
	}
}