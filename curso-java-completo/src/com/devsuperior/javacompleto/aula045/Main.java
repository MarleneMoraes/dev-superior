package com.devsuperior.javacompleto.aula045;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		//Estrutura repetitiva ENQUANTO
		while (x != 0 ) {
			x = sc.nextInt();
		}
		
		/*
		 	Problema exemplo:
		 	Fazer um programa que lê números inteiros até que zero seja lido. 
		 	Ao final mostra a soma dos números lidos. 
		*/
		
		x = sc.nextInt();
		
		int soma = 0;
		
		while (x != 0 ) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
