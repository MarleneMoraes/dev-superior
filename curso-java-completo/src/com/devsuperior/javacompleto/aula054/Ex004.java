/*
    Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo
    segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
*/

package com.devsuperior.javacompleto.aula054;

import java.util.Scanner;

public class Ex004 {
	static void ex004() {
        Scanner sc = new Scanner(System.in);

        System.out.println("DIVIS�O");
        System.out.print("Digite a quantidade de pares de n�meros que deseja: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o primeiro n�mero: ");
            int primeiroNumero = sc.nextInt();
            
            System.out.print("Digite o segundo n�mero: ");
            int segundoNumero = sc.nextInt();

            if (segundoNumero == 0) {
                System.out.println("divisao impossivel");
            }
            else {
                double divisao = (double) primeiroNumero / segundoNumero;
                System.out.printf("%.1f%n", divisao);
            }
        }

        sc.close();
   } 
}
