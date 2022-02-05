/*
    Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
    hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
    decimais.
*/

package com.devsuperior.javacompleto.aula030;

import java.util.Scanner;

public class Ex004 {
	static void ex004(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("SALÁRIO DE FUNCIONÁRIOS");
        System.out.println("Número: ");
        int numero = scanner.nextInt();
        
        System.out.println("Salário: ");
        float salario = scanner.nextFloat();
        
        System.out.printf("NUMBER = %d\nSALARY = U$%.2f", numero, salario);
        scanner.close();
    }
}
