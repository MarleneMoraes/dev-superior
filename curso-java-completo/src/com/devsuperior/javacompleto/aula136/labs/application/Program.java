package com.devsuperior.javacompleto.aula136.labs.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
* 
* @author Marlene
* SECAO 13: Heranca e polimorfismo
* AULA 136. Exercicio de fixacao 
*/

import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.javacompleto.aula136.labs.entities.ImportedProduct;
import com.devsuperior.javacompleto.aula136.labs.entities.Product;
import com.devsuperior.javacompleto.aula136.labs.entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> products = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int number = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < number; i++) {
			System.out.printf("Product #%d data:%n", i + 1);

			System.out.print("Common, used or imported (c/u/i)? ");
			String character = scan.nextLine().toLowerCase();

			System.out.print("Name: ");
			String name = scan.nextLine();

			System.out.print("Price: ");
			double price = scan.nextDouble();
			scan.nextLine();

			if (character.charAt(0) == 'c') {
				products.add(new Product(name, price));
			}

			if (character.charAt(0) == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String date = scan.nextLine();
				products.add(new UsedProduct(name, price, dateFormat.parse(date)));
			}

			if (character.charAt(0) == 'i') {
				System.out.print("Customs fee: ");
				Double customs = scan.nextDouble();
				scan.nextLine();
				products.add(new ImportedProduct(name, price, customs));
			}
		}
		
		System.out.println("\nPRICE TAGS:");
		for(Product product : products) {
			System.out.println(product.priceTag());
		}

		scan.close();
	}

}
