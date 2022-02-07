package com.devsuperior.javacompleto.aula061;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) { //fun��o padr�o do Java. Caso esta classe ser execut�vel, ela � obrigat�ria
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c); //fun��o personalizada com par�metros
		
		showResult(higher); //fun
			
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		
		if (x > y && x > y) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.printf("Higher = %d", value);
	}

}
