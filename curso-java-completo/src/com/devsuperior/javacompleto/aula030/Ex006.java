/*
    Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e
    mostre:
    
    a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
    b) a �rea do c�rculo de raio C. (pi = 3.14159)
    c) a �rea do trap�zio que tem A e B por bases e C por altura.
    d) a �rea do quadrado que tem lado B.
    e) a �rea do ret�ngulo que tem lados A e B.
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
