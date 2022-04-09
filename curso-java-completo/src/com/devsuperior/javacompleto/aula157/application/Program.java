package com.devsuperior.javacompleto.aula157.application;

/**
 * 
 * @author Marlene
 * SEÇÃO 15: Tratamento de Exceções
 * AULA 157. Estrutura try-catch
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
