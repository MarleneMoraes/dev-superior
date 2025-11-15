package com.devsuperior.javacompleto.aula126.labs.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.javacompleto.aula126.labs.entities.Client;
import com.devsuperior.javacompleto.aula126.labs.entities.Order;
import com.devsuperior.javacompleto.aula126.labs.entities.OrderItem;
import com.devsuperior.javacompleto.aula126.labs.entities.Product;
import com.devsuperior.javacompleto.aula126.labs.entities.enums.OrderStatus;


/**
 * 
 * @author Marlene 
 * SECAO 12: Enumeracoes, composicao
 * AULA 126. Exercicio de fixacao
 * 
 */

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

		
		System.out.println("Enter client data:");
		Client client = new Client();
		
		System.out.print("Name: ");
		client.setName(scan.nextLine());
		
		System.out.print("E-mail: ");
		client.setEmail(scan.nextLine());
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		client.setBirthDate(date.parse(scan.next()));
		scan.nextLine();
		
		System.out.println("Enter order data: ");
		Order order = new Order();
		
		System.out.print("Status: ");
		order.setStatus(OrderStatus.valueOf(scan.nextLine()));
		
		order.setClient(client);
		
		System.out.print("How many items to this order? ");
		int qtdItems = scan.nextInt();
		scan.nextLine();
		
		for(int i = 0; i < qtdItems; i++) {
			System.out.printf("Enter #%d item data: %n", i + 1);
			Product product = new Product();
			OrderItem item = new OrderItem();
			
			System.out.print("Product name: ");
			product.setName(scan.nextLine());
			
			System.out.print("Product price: ");
			product.setPrice(scan.nextDouble());
			scan.nextLine();
			
			item.setProduct(product);
			
			System.out.print("Quantity: ");
			item.setQuantity(scan.nextInt());
			scan.nextLine();
			
			order.addItem(item);
		}
		
		System.out.println("ORDER SUMMARY");
		System.out.println(order.toString());
		scan.close();

	}

}
