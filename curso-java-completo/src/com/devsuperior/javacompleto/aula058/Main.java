package com.devsuperior.javacompleto.aula058;

/**
 * 
 * @author Marlene
 * SE��O 7: Outros t�picos b�sicos sobre Java
 * AULA 58. Operadores bitwise
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// OPERADORES BITWISE
		
		int mask = 0b1000000; //m�scara 
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}
		
		sc.close();
	}

}
