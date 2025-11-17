package com.devsuperior.javacompleto.aula091.labs.ex03.application;

import java.util.Scanner;

import com.devsuperior.javacompleto.aula091.labs.ex03.entities.Person;

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
			System.out.printf("Person data #%d:%n", (i + 1));
			Person person = new Person();

			System.out.print("Name: ");
			person.setName(scan.nextLine());

			System.out.print("Age: ");
			person.setAge(scan.nextInt());

			System.out.print("Height: ");
			person.setHeight(scan.nextDouble());
			scan.nextLine();

			people[i] = person;
		}

		double sumH = 0.0;
		int underSixteen = 0;

		for (int i = 0; i < n; i++) {
			sumH += people[i].getHeight();

			if (people[i].getAge() < 16) {
				underSixteen++;
			}
		}

		System.out.printf("Average height: %.2f", (sumH / n));

		System.out.printf("%nPeople under 16 years of age: %.1f%%%n", (double) underSixteen / n * 100.0);

		for (Person person : people) {
			if (person.getAge() < 16) {
				System.out.println(person.getName());
			}
		}

		scan.close();
	}
}
