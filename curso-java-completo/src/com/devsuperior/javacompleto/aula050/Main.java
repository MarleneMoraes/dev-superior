package com.devsuperior.javacompleto.aula050;

/**
 * 
 * @author Marlene
 * SEÇÃO 6: Estruturas repetitivas
 * AULA 50. Estrutura repetitiva para (for)
 */


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		
		int soma = 0;
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma += x;			
		}

		System.out.println(soma);
		
		
		//CONTAGEM PROGRESSIVA
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Valor de i: %d%n", i);
		}
		
		//CONTAGEM REGRESSIVA
		
		for(int i = 4; i >= 0; i--) {
			System.out.printf("Valor de i: %d%n", i);
		}
		
		sc.close();
	}

}
