package com.devsuperior.javacompleto.aula026;

/**
 * 
 * @author Marlene
 * SE��O 4: Estrutura sequencial
 * AULA 26. Entrada de dados em Java - Parte 1
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String x;
		x = sc.next();
		System.out.println("Voc� digitou: " + x);
		
		int y;
		y = sc.nextInt();
		System.out.println("Voc� digitou: " + y);
		
		double z;
		z = sc.nextDouble();
		System.out.println("Voc� digitou: " + z); //Imprimir� com o padr�o US
		System.out.printf("Voc� digitou: %.2f%n", z); //Imprimir� com o padr�o da m�quina
		
		Locale.setDefault(Locale.US);
		System.out.printf("Voc� digitou: %.2f%n", z); //Imprimir� com o padr�o US, pois o padr�o tornou-se US
		sc.close();
		
		
		char w;
		w = sc.next().charAt(0);
		System.out.println("Voc� digitou: " + w); //Imprime a letra digitada. Mesmo que digite uma palavra, o programa imprimir� a primeira letra
		
		//Ler v�rios dados na mesma linha
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados Digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
