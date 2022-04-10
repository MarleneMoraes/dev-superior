package com.devsuperior.javacompleto.aula067.application;

/**
 * 
 * @author Marlene
 * SEÇÃO 8: Introdução à Programação Orientada a Objetos
 * AULA 67. Começando a resolver um segundo problema exemplo
 */

import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.javacompleto.aula067.entities.Product;

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

		
		sc.close();
	}

}
