/*
    Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
 */

package com.devsuperior.javacompleto.aula037;

import java.util.Scanner;

public class Ex002 {
	static void ex002(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("PROGRAMA DE VERIFICA��O - PAR OU �MPAR");
        System.out.println("Digite um valor para verifica��o se � par ou �mpar.");
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
