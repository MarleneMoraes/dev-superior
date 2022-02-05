/*
    Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
    mostre:
    
    a) a área do triângulo retângulo que tem A por base e C por altura.
    b) a área do círculo de raio C. (pi = 3.14159)
    c) a área do trapézio que tem A e B por bases e C por altura.
    d) a área do quadrado que tem lado B.
    e) a área do retângulo que tem lados A e B.
*/

package com.devsuperior.javacompleto.aula030;

import java.util.Scanner;

public class Ex006 {
	 static void ex006(){
	        Scanner scanner = new Scanner (System.in);
	        
	        System.out.print("Digite o primeiro valor: ");
	        float a = scanner.nextFloat();
	        
	        System.out.print("Digite o segundo valor: ");
	        float b = scanner.nextFloat();
	        
	        System.out.print("Digite o terceiro valor: ");
	        float c = scanner.nextFloat();
	        
	        float areaTriangulo = ((a*c)/2);
	        double areaCirculo = 3.14159 * (Math.pow(c,2));
	        float areaTrapezio = ((a+b)*c)/2;
	        float areaQuadrado = (b*b);
	        float areaRetangulo = (a*b);
	        
	        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
	        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
	        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
	        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
	        System.out.printf("TRIANGULO: %.3f\n", areaRetangulo);
	        
	        scanner.close();
	    }
}
