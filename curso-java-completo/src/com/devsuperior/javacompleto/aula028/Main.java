package com.devsuperior.javacompleto.aula028;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		//RAIZ QUADRADA
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.printf("Raiz quadrada de %.1f = %f%n", x, A);
		System.out.printf("Raiz quadrada de %.1f = %.1f%n", y, B);
		System.out.printf("Raiz quadrada de 25 = %.1f%n", C);
		
		
		//POTENCIAÇÃO
		A = Math.pow(x,y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.printf("%.1f elevado a %.1f = %.1f%n", x, y, A);
		System.out.printf("%.1f elevado ao quadrado = %.1f%n", x, B);
		System.out.printf("5 elevado a ao quadrado = %.1f%n", x, y, A);
		
		//VALOR ABSOLUTO
		A = Math.abs(y);
		B = Math.abs(z);
		
		System.out.printf("Valor absoluto de %.1f  = %.1f%n", y, A);
		System.out.printf("Valor absoluto de %.1f  = %.1f%n", z, B);
		
		
		//EXPRESSÕES MAIORES
		
		double delta, a, b, c, x1, x2;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2.0) - 4 * a * c;
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.printf("x1 = %.2f%n x2 = %.2f%n", x1, x2);
		sc.close();
	}

}
