/*
    Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
    hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
    decimais.
*/

package com.devsuperior.javacompleto.aula030;

import java.util.Scanner;

public class Ex004 {
	static void ex004(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("SAL�RIO DE FUNCION�RIOS");
        System.out.println("N�mero: ");
        int numero = scanner.nextInt();
        
        System.out.println("Sal�rio: ");
        float salario = scanner.nextFloat();
        
        System.out.printf("NUMBER = %d\nSALARY = U$%.2f", numero, salario);
        scanner.close();
    }
}
