/*
    Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
    começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
    exemplo.
 */

package com.devsuperior.javacompleto.aula054;

import java.util.Scanner;

public class Ex007 {
	 static void ex007() {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        for (int i = 1; i <= n; i++) {
	            
	            int valor1 = i;
	            int valor2 = (int) Math.pow(i,2);
	            int valor3 = (int) Math.pow(i,3);
	            System.out.printf("%d %d %d%n", valor1, valor2, valor3);
	        }

	        sc.close();
	   } 
}
