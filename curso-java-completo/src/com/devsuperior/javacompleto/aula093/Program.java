package com.devsuperior.javacompleto.aula093;

/**
 * 
 * @author Marlene 
 * SE��O 10: Comportamento de Mem�ria, arrays, listas 
 * AULA 93. La�o for each
 */

public class Program {

	public static void main(String[] args) {
		String[] vect = new String[] { "Maria", "Bob", "Alex" };
		
		//La�o For
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		//La�o For Each: para cada elemento obj, fa�a
		
		for (String obj : vect) {
			System.out.println(obj);
		}

	}

}
