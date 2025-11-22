package com.devsuperior.javacompleto.aula202.labs.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.devsuperior.javacompleto.aula202.labs.entities.Product;

/**
 * 
 * @author Marlene 
 * SECAO 18: Programacao Funcional e expressoes lambda 
 * AULA 202.Exercicio resolvido (stream)
 * 
 */

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = scan.nextLine();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			List<Product> list = new ArrayList<>();
			
			String line = reader.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = reader.readLine();
			}
			
			double avg = list.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x,y) -> x + y) / list.size();
			
			Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> names = list.stream()
					.filter(p -> p.getPrice() < avg)
					.map(p -> p.getName())
					.sorted(comparator.reversed())
					.collect(Collectors.toList());
			
			System.out.println("Average price: " + String.format("%.2f", avg));
			names.forEach(System.out::println);
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		scan.close();
	}
}