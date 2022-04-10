package com.devsuperior.javacompleto.aula038;

/**
 * 
 * @author Marlene
 * SEÇÃO 5: Estrutura condicional
 * AULA 38. Sintaxe opcional - operadores de atribuição cumulativa
 */


import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta  = 50.0;
		if(minutos > 100) {
			conta += (minutos - 100);
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		sc.close();
	}

}
