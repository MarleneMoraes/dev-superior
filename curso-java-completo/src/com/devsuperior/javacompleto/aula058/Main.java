package com.devsuperior.javacompleto.aula058;
/**
 * 
 * @author Marlene
 * SEÇÃO 8: Introdução à Programação Orientada a Objetos
 * AULA 58. Operadores bitwise
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// OPERADORES BITWISE
		
		int mask = 0b1000000; //máscara 
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}
		
		sc.close();
	}

}
