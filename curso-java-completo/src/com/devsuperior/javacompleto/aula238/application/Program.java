package com.devsuperior.javacompleto.aula238.application;

import java.util.Scanner;

import com.devsuperior.javacompleto.aula238.services.PrintService;
import com.devsuperior.javacompleto.aula238.services.PrintServiceObject;

/**
 * 
 * @author Marlene 
 * SECAO 19: Generics, Set, Map 
 * AULA 238. Generics
 */

public class Program {
	// Generics permitem que classes, interfaces e metodos possam ser parametrizados por tipo
	// uso comum de Generics -> colecoes
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.print("How many values? ");
		int n = scan.nextInt();
		
		// TypeSafety: seguranca de tipos - Object nao pode assegurar o tipo da colecao
		PrintServiceObject printServiceObject = new PrintServiceObject();
		
		printServiceObject.addValue("Maria");

		for (int i = 0; i < n; i++) {
			int value = scan.nextInt();
			printServiceObject.addValue(value);
		}
		
		printServiceObject.print();
		Integer x = (Integer) printServiceObject.first(); // falta de performance
		System.out.println("First: " + x); // ClassCastException - este programa possui um valor String como primeiro tipo, que nao pode ser convertido
		
		
		// Solucao com Generics
		
		PrintService<Integer> printServiceInteger = new PrintService<>(); // instanciacao com Integer
		
		for (int i = 0; i < n; i++) {
			Integer value = scan.nextInt();
			printServiceInteger.addValue(value);
		}
		
		printServiceInteger.print();
		System.out.println("First: " + printServiceInteger.first());
		
		PrintService<String> printServiceString = new PrintService<>(); // instanciacao com String
		
		for (int i = 0; i < n; i++) {
			String value = scan.next();
			printServiceString.addValue(value);
		}
		
		printServiceString.print();
		System.out.println("First: " + printServiceString.first());
		
		scan.close();
	}
	
	

	
	
	
}
