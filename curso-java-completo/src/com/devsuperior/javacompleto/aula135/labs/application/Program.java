package com.devsuperior.javacompleto.aula135.labs.application;

/**
 * 
 * @author Marlene
 * SECAO 13: Heranca e polimorfismo
 * AULA 135. Exercicio resolvido 
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.javacompleto.aula135.labs.entities.Employee;
import com.devsuperior.javacompleto.aula135.labs.entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.println("Enter the number of employees: ");
		int number = scan.nextInt();
		
		for (int i = 1; i <= number; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char character = scan.next().charAt(0);
			
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			
			System.out.println("Hours: ");
			int hours = scan.nextInt();
			
			System.out.println("Value per hour: ");
			double valuePerHour = scan.nextDouble();
			
			if(character == 'y' || character == 'Y') {
				System.out.print("Additional charge: ");
				double additionalCharge = scan.nextDouble();
				employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			
			if(character == 'n' || character == 'n') {
				employees.add(new Employee(name, hours, valuePerHour));
			} 
		}
		
		System.out.printf("\nPAYMENTS");
		
		for (Employee employee : employees) {
			System.out.printf("\n" + employee.getName() + " - $ " + String.format("%.2f", employee.payment()) + "\n");
		}
		
		scan.close();
	}

}
