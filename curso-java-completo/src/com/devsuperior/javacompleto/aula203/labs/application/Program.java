package com.devsuperior.javacompleto.aula203.labs.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.devsuperior.javacompleto.aula203.labs.entities.Employee;

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
			List<Employee> employees = new ArrayList<>();
			
			String line = reader.readLine();
			while(line != null) {
				String[] data = line.split(",");
				employees.add(new Employee(data[0], data[1], Double.parseDouble(data[2])));
				line = reader.readLine();
			}
			
			System.out.print("Enter salary: ");
			double salary = scan.nextDouble();
			
			List<String> emails = employees.stream()
					.filter(e -> e.getSalary() > salary)
					.map(e -> e.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary));
			emails.forEach(System.out::println);
			
			double sum = employees.stream()
					.filter(e -> e.getName().charAt(0) == 'M')
					.map(e -> e.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		scan.close();
	}
}