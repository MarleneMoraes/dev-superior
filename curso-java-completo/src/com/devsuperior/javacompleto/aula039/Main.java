package com.devsuperior.javacompleto.aula039;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch(x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "ter�a";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "s�bado";
			break;
		default:
			dia = "valor inv�lido";
		}
		
		System.out.printf("Dia da semana: %s", dia);
		sc.close();
	}

}
