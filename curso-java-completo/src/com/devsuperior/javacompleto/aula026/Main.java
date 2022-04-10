package com.devsuperior.javacompleto.aula026;

/**
 * 
 * @author Marlene
 * SEÇÃO 4: Estrutura sequencial
 * AULA 26. Entrada de dados em Java - Parte 1
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		
		double z;
		z = sc.nextDouble();
		System.out.println("Você digitou: " + z); //Imprimirá com o padrão US
		System.out.printf("Você digitou: %.2f%n", z); //Imprimirá com o padrão da máquina
		
		Locale.setDefault(Locale.US);
		System.out.printf("Você digitou: %.2f%n", z); //Imprimirá com o padrão US, pois o padrão tornou-se US
		sc.close();
		
		
		char w;
		w = sc.next().charAt(0);
		System.out.println("Você digitou: " + w); //Imprime a letra digitada. Mesmo que digite uma palavra, o programa imprimirá a primeira letra
		
		//Ler vários dados na mesma linha
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados Digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
