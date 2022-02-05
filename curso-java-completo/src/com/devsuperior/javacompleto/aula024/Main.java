package com.devsuperior.javacompleto.aula024;

import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		System.out.println("Olá mundo!");
		System.out.println("Bom dia!");
		
		
		//Escrever o conteúdo de uma variável de algum tipo básico
		
		int y = 32;
		System.out.println(y);
		
		//Escrever o conteúdo de uma variável com ponto flutuante
		double x = 10.35784;
		
		System.out.println(x);
		System.out.printf("%.2f%n", x); //limitar em 2 casas decimais. O %n é uma quebra de linha, \n faz o mesmo
		System.out.printf("%.4f%n", x); //limitar em 4 casas decimais.
		
		Locale.setDefault(Locale.US); //O printf, por padrão pega o idioma do computador. Para padronizar, utilizar o Locale.
		
		//Concatenar vários elementos em um mesmo comando de escrita
		System.out.println("RESULTADO = " + x + "METROS");
		
		//Concatenar vários elementos em um mesmo comando de escrita com printf
		System.out.printf("RESULTADO = %.2f mestros%n", x);
		
		/*
		 * %f = ponto flutuante
		 * %d = inteiro
		 * %s = texto
		 * %n = quebra de linha
		 */
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$%.2f reais%n", nome, idade, renda);
		
	}
}
