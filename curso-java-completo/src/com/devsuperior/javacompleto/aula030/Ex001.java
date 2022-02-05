/*
    Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa.
 */

package com.devsuperior.javacompleto.aula030;

import java.util.Scanner;

public class Ex001 {
	static void ex001() {
        Scanner scanner = new Scanner(System.in);
        int valor1, valor2, soma;

        System.out.println("SOMA DOS VALORES");

        System.out.println("Digite um número: ");
        valor1 = scanner.nextInt();

        System.out.println("Digite um número: ");
        valor2 = scanner.nextInt();
        
        soma = Soma(valor1,valor2);
        
        System.out.printf("SOMA = %d\n", soma);
        
        scanner.close();
    }

    static int Soma(int a, int b) {
        return (a + b);
    }
}
