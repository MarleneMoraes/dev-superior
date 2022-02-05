/*
    Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto
    de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).
 */

package com.devsuperior.javacompleto.aula030;

import java.util.Scanner;

public class Ex003 {
	static void ex003() {
        Scanner scanner = new Scanner (System.in);
        int numero[], diferenca;
        
        numero = new int [4];
        
        System.out.println("DIFEREN�A DO PRODUTO");
        
        for (int i=0; i < 4; i++){
          System.out.println("Digite um n�mero: ");
          numero[i] = scanner.nextInt();
        }
        
        diferenca = diferencaProduto(numero[0], numero[1], numero[2], numero[3]);
        
        System.out.printf("DIFEREN�A = %d", diferenca);  
        
        scanner.close();
    }
    
    static int diferencaProduto(int a, int b, int c, int d){
        return a*b-c*d;
    }
}
