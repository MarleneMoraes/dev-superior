package com.devsuperior.javacompleto.aula089.application;

import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.javacompleto.aula089.entities.Product;

/**
 * 
 * @author Marlene 
 * SE��O 10: Comportamento de Mem�ria, arrays, listas 
 * AULA 89.Vetores - Parte 2
 */

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//Vetor de tipo refer�ncia
		Product[] vect = new Product[n];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price); //instanciar um novo produto
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRIVE = %.2f", avg);
		
		sc.close();
	}

}