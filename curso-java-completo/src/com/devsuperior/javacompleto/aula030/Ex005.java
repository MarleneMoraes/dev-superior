/*
    Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
    c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
*/

package com.devsuperior.javacompleto.aula030;

import java.util.Scanner;

public class Ex005 {
	static void ex005(){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("CAIXA");
        int numeroPecas = 0;
        float valorUnit = 0, valorTotal = 0;
        
        for(int count = 0; count < 2; count++) {
           System.out.print("Digite o c�digo da pe�a: ");
           int codigoPecas = scanner.nextInt();

           System.out.print("Digite o n�mero de pe�as: ");
           numeroPecas = scanner.nextInt();

           System.out.print("Digite o valor unit�rio da pe�a: ");
           valorUnit = scanner.nextFloat();
           
           valorTotal += valorPeca(numeroPecas, valorUnit);
        }
        
        System.out.printf("VALOR A PAGAR: R$%.2f\n", valorTotal);
        
        scanner.close();
    }
    
    static float valorPeca(int n, float v){
       return (n * v); 
    }
}
