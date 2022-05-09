package com.devsuperior.javacompleto.aula093;

/**
 * 
 * @author Marlene 
 * SEÇÃO 10: Comportamento de Memória, arrays, listas 
 * AULA 93. Laço for each
 */

public class Program {

	public static void main(String[] args) {
		String[] vect = new String[] { "Maria", "Bob", "Alex" };
		
		//Laço For
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		//Laço For Each: para cada elemento obj, faça
		
		for (String obj : vect) {
			System.out.println(obj);
		}

	}

}
