/*
    Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
    Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. 
    Aten��o: os n�meros devem poder ser digitados em ordem crescente ou decrescente.
*/

package com.devsuperior.javacompleto.aula037;

import java.util.Scanner;

public class Ex003 {
	static void ex003(){
        Scanner sc = new Scanner(System.in);

        System.out.println("PROGRAMA DE VERIFICA��O - M�LTIPLOS OU N�O");
        System.out.println("Digite dois valores para verifica��o se s�o m�ltiplos ou n�o.");
        System.out.print("Primeiro valor: ");
        int a = sc.nextInt();
        
        System.out.print("Segundo valor: ");
        int b = sc.nextInt();
        
        if (a%b == 0 || b%a ==0){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}
