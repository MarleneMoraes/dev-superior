package com.devsuperior.javacompleto.aula091.labs.ex11.application;

import java.util.Scanner;

import com.devsuperior.javacompleto.aula091.labs.ex11.entities.Person;

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

		for (int i = 0; i < people.length; i++) {
			System.out.printf("Enter the name, first and second grades of the student #%d:%n", (i+1));
			Person person = new Person();
			
			System.out.printf("Person #%d height: ", (i + 1));
			person.setHeight(scan.nextDouble());
			scan.nextLine();
			
			System.out.printf("Person #%d gender: ", (i + 1));
			person.setGender(scan.next().charAt(0));
			
			people[i] = person;
		}


		double shortest = 0.0;
		double tallest = 0.0;
		double sumHeightWoman = 0.0;
		int qtdMen = 0;
		
		for(Person person : people) {
			if(person == people[0]) {
				shortest = person.getHeight();
				tallest = person.getHeight();
			}
			
			if (shortest > person.getHeight()) {
				shortest = person.getHeight();
			}
			
			if(tallest < person.getHeight()) {
				tallest = person.getHeight();
			}
			
			if(person.getGender() == 'F') {
				sumHeightWoman += person.getHeight();
			} else {
				qtdMen += 1;
			}
		}
		
		System.out.printf("Shortest height = %.2f%n", shortest);
		System.out.printf("Tallest height = %.2f%n", tallest);
		System.out.printf("Average height of women = %.2f%n", sumHeightWoman / (n - qtdMen));		
		System.out.printf("Number of men = %d%n", qtdMen);
		scan.close();
	}
}
