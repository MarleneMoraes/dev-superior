package com.devsuperior.javacompleto.aula092;

/**
 * 
 * @author Marlene 
 * SEÇÃO 10: Comportamento de Memória, arrays, listas 
 * AULA 92. Boxing, unboxing e wrapper classes
 */


public class Program {
	
	public static void main(String[] args) {
		//Boxing
		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj); //20
		
		//Unboxing
		int y = (int) obj;
		
		/*
		 * Wrapper classes: 
		 * utilização das classes dos tipos primitivos sem utilização de casting
		 * 
		 * Muito utilizado em Sistemas de Informação, pois aceita valores nulos
		 */
		Integer i = x;
		
		y = i;
		
		y = i * 2;
		
		System.out.println(y);
		
		
	}
	
}
