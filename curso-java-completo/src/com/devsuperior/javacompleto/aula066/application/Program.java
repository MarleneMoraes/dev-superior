package com.devsuperior.javacompleto.aula066.application;

/**
 * 
 * @author Marlene
 * SEÇÃO 8: Introdução à Programação Orientada a Objetos
 * AULA 66. Criando um método para obtermos os benefícios de reaproveitamento e delegação
 */

import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.javacompleto.aula066.entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Uma única variável do tipo triângulo
		Triangle x, y;
		
		//Para que o objeto exista, precisa ser chamado:
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}

}
