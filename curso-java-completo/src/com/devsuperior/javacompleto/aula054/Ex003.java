/*
    Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
    de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
    conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
    peso 5.
 */

package com.devsuperior.javacompleto.aula054;

import java.util.Scanner;

public class Ex003 {
	static void ex003() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("MÉDIA PONDERADA");

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
                
                System.out.print("Digite o primeiro valor: ");
                float valor1 = sc.nextFloat();
                
                System.out.print("Digite o segundo valor: ");
                float valor2 = sc.nextFloat();
                
                System.out.print("Digite o terceiro valor: ");
                float valor3 = sc.nextFloat();

                double media = ((valor1 * 2) + (valor2 * 3) + (valor3 * 5)) / 10;

                System.out.printf("%.1f%n", media);
        }

        sc.close();
   } 
}
