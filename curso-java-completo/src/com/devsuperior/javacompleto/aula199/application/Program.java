package com.devsuperior.javacompleto.aula199.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.devsuperior.javacompleto.aula199.entities.Product;
import com.devsuperior.javacompleto.aula199.services.ProductService;

/**
 * 
 * @author Marlene 
 * SECAO 18: Programacao Funcional e expressoes lambda 
 * AULA 199. Criando funcoes que recebem funcoes como parametro
 * 
 */

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		ProductService service = new ProductService();
		
		double sum = service.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		System.out.println("Sum = $" + String.format("%.2f", sum));
		
		sum = service.filteredSum(list, p -> p.getName().charAt(0) == 'M');
		System.out.println("Sum = $" + String.format("%.2f", sum));
		
		sum = service.filteredSum(list, p -> p.getPrice() < 100.0);
		System.out.println("Sum = $" + String.format("%.2f", sum));
	}
}