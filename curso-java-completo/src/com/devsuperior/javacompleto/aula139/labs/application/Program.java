package com.devsuperior.javacompleto.aula139.labs.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.javacompleto.aula139.labs.entities.Company;
import com.devsuperior.javacompleto.aula139.labs.entities.Individual;
import com.devsuperior.javacompleto.aula139.labs.entities.TaxPayer;

/**
 * 
 * @author Marlene
 * SECAO 13: Heranca e polimorfismo
 * AULA 139. Exercicio de fixacao 
 */

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		List<TaxPayer> taxPayers = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int number = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < number; i++) {
			System.out.printf("Tax payer #%d data:%n", i + 1);

			System.out.print("Individual or company (i/c)? ");
			String character = scan.nextLine().toLowerCase();

			System.out.print("Name: ");
			String name = scan.nextLine();

			System.out.print("Anual income: ");
			double anualIncome = scan.nextDouble();
			scan.nextLine();

			if (character.charAt(0) == 'i') {
				System.out.print("Health Expenditures: ");
				Double healthExpenditures = scan.nextDouble();
				scan.nextLine();
				taxPayers.add(new Individual(name, anualIncome, healthExpenditures));
			}

			if (character.charAt(0) == 'c') {
				System.out.print("Number of Employees: ");
				int qtdEmployees = scan.nextInt();
				scan.nextLine();
				taxPayers.add(new Company(name, anualIncome, qtdEmployees));
			}
		}
		
		System.out.println("\nTAXES PAID:");
		double sum = 0.0;
		
		for(TaxPayer taxPayer : taxPayers) {
			sum += taxPayer.tax();
			System.out.println(taxPayer.toString());	
		}
		
		System.out.printf("TOTAL TAXES: $ %.2f", sum);

		scan.close();
	}
}
