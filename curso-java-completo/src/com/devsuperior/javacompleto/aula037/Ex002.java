/*
    Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */

package com.devsuperior.javacompleto.aula037;

import java.util.Scanner;

public class Ex002 {
	static void ex002(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("PROGRAMA DE VERIFICAÇÃO - PAR OU ÍMPAR");
        System.out.println("Digite um valor para verificação se é par ou ímpar.");
        System.out.print("Valor: ");
        int numero = sc.nextInt();
        
        if (numero%2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        
        sc.close();
    }
}
