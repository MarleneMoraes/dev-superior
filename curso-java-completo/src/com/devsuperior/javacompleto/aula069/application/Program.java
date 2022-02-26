package com.devsuperior.javacompleto.aula069.application;

import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.javacompleto.aula069.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantitity = sc.nextInt();

		System.out.println("\nProduct data: " + product); 
		
		System.out.print("\nEnter the number of prodects to be added in stock: ");
		int quantitity = sc.nextInt();
		
		product.addProducts(quantitity);
		
		System.out.println("\nUpdated data: " + product); 
		
		System.out.print("\nEnter the number of prodects to be removed from stock: ");
		quantitity = sc.nextInt();
		
		product.removeProducts(quantitity);
		
		System.out.println("\nUpdated data: " + product); 
		
		sc.close();
	}

}
