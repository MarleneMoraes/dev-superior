package com.devsuperior.javacompleto.aula170.application;

/**
 * 
 * @author Marlene
 * SECAO 15: Tratamento de Excecoes
 * AULA 170. Estrutura try-catch
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vector = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vector[position]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		} 
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		sc.close();
		System.out.println("End of program");
		
	}

}
