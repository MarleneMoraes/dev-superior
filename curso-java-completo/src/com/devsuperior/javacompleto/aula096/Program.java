package com.devsuperior.javacompleto.aula096;

/**
 * 
 * @author Marlene 
 * SECAO 10: Comportamento de Mem�ria, arrays, listas 
 * AULA 96. Boxing, unboxing e wrapper classes
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
		 * utiliza��o das classes dos tipos primitivos sem utiliza��o de casting
		 * 
		 * Muito utilizado em Sistemas de Informa��o, pois aceita valores nulos
		 */
		Integer i = x;
		
		y = i;
		
		y = i * 2;
		
		System.out.println(y);
		
		
	}
	
}
