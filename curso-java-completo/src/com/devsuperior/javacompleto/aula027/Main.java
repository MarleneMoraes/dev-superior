package com.devsuperior.javacompleto.aula027;

/**
 * 
 * @author Marlene
 * SEÇÃO 4: Estrutura sequencial
 * AULA 27. Entrada de dados em Java - Parte 2
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String s1, s2, s3;
		
		//Leitura de dados até a quebra de linha: nextLine. Se quiser apenas uma palavra: next()
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados Digitados:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//Quebra de linha pendente
		int x;
		
		x = sc.nextInt(); //quebra de linha pendente na entrada padrão
		sc.nextLine(); //solução para o consumo de linha pendente 
		s1 = sc.nextLine();//consumiu a linha pendente e resultará em uma string vazia
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados Digitados:");
		System.out.println(x); 
		System.out.println(s1); 
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
