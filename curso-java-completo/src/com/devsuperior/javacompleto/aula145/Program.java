package com.devsuperior.javacompleto.aula145;

/**
 * 
 * @author Marlene
 * SECAO 14: Tratamento de Excecoes
 * AULA 145. Pilha de chamadas de metodos (stack trace)
 */


import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		method1();
		System.out.println("End of program");
		
	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	
	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vector = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vector[position]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace(); //sequencia de chamadas que gerou a excecao
			sc.next();
		} 
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		sc.close();
		System.out.println("***METHOD2 END***");
	}

}
