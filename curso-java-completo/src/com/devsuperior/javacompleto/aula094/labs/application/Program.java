package com.devsuperior.javacompleto.aula094.labs.application;

import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.javacompleto.aula094.labs.entities.Student;

/**
 * 
 * @author Marlene 
 * SECAO 10: Comportamento de Memoria, arrays, listas 
 * AULA 94. Desafio sobre vetores (pensionato)
 */

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student[] vect = new Student [9];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			sc.nextLine();
			System.out.println("Rent #" + (i+1));
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Student(name, email, room);
		}
		
		System.out.println("\nBusy rooms:");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.printf("%d: %s, %s\n", vect[i].getRoom(), vect[i].getName(), vect[i].getEmail());
			
			}
		}
		
		sc.close();
	}

}