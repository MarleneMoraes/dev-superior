package com.devsuperior.javacompleto.aula091.labs.ex09.application;

import java.util.Scanner;

import com.devsuperior.javacompleto.aula091.labs.ex09.entities.Person;

/**
 * 
 * @author Marlene 
 * SECAO 10: Comportamento de Memoria, arrays, listas 
 * AULA 91. Exercicios de fixacao sobre os vetores
 * 
 */

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("How many people do you type? ");
		int n = scan.nextInt();
		scan.nextLine();

		Person[] people = new Person[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Person data #%d:%n", (i+1));
			Person person = new Person();
			
			System.out.print("Name: ");
			person.setName(scan.nextLine());
			
			System.out.print("Age: ");
			person.setAge(scan.nextInt());
			scan.nextLine();
			
			people[i] = person;
		}
		
		Person eldest = new Person();
		int eldestAge = 0;

		for(Person person : people) {
			if(eldestAge < person.getAge()) {
				eldest = person;
				eldestAge = person.getAge();
			}
		}

		System.out.printf("ELDEST: %s", eldest.getName());
		
		scan.close();
	}
}
