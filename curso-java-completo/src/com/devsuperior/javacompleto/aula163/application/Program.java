package com.devsuperior.javacompleto.aula163.application;

/**
 * 
 * @author Marlene
 * SECCAO 14: Heranca e polimorfismo
 * AULA 163. Classes abstratas 
 */

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.javacompleto.aula163.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		

		List<Product> products = new ArrayList<>();

		System.out.println("Enter the number of products: ");
		int quantitity = scanner.nextInt();

		for (int i = 0; i < quantitity; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Common, used or imported? (c/u/i)");
			char typeProduct = scanner.next().charAt(0);

			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();

			System.out.print("Price: ");
			double price = scanner.nextDouble();

			if (typeProduct == 'u' || typeProduct == 'U') {
				String date;
				SimpleDateFormat manufactureDate = new SimpleDateFormat("dd/MM/yyyy");
				System.out.print("Manufacture Date (DD/MM/YYYY): ");
				date = scanner.nextLine();
				
				//ma
				
			}

			if (typeProduct == 'i' || typeProduct == 'I') {
				System.out.print("Customs fee: ");
				
			}

		}

		// list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));

		// double total = 0.0;

		/*
		 * for (Account acc: list) { sum += acc.getBalance(); }
		 * 
		 * System.out.printf("Total balance: $ %.2f\n", sum);
		 * 
		 * for (Account acc: list) { acc.deposit(10.0); }
		 * 
		 * for (Account acc: list) {
		 * System.out.printf("Updated balance for account %d: %.2f\n", acc.getNumber(),
		 * acc.getBalance()); }
		 */

		scanner.close();
	}

}
