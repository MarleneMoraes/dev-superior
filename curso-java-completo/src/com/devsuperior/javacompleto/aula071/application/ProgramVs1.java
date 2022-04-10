package com.devsuperior.javacompleto.aula071.application;

/**
 * 
 * @author Marlene
 * SE��O 8: Introdu��o � Programa��o Orientada a Objetos
 * AULA 71. Membros est�ticos - Parte 1
 */

import java.util.Locale;
import java.util.Scanner;

public class ProgramVs1 {
	
	//final � utilizado para constantes, declara��es imut�veis at� o final do programa
	public static final double PI = 3.14159; 

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI value: %.2f\n", PI);
		sc.close();
	}

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume (double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3.0;
	}
}
