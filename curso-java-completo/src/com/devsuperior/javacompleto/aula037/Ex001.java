/*
    Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
*/

package com.devsuperior.javacompleto.aula037;

import java.util.Scanner;

public class Ex001 {
	static void ex001(){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("NEGATIVO OU N�O NEGATIVO?");
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
