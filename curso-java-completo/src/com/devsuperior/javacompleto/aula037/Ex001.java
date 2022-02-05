/*
    Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
*/

package com.devsuperior.javacompleto.aula037;

import java.util.Scanner;

public class Ex001 {
	static void ex001(){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("NEGATIVO OU NÃO NEGATIVO?");
        System.out.print("Digite um valor: ");
        int numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println("NAO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}
