package com.devsuperior.javacompleto.aula070.labs.ex02.application;

import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.javacompleto.aula070.labs.ex02.entities.Employee;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println(employee);
		
		System.out.print("\nWhich percentage to increase salary?");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("\nUpdated data: " + employee);
		
	}

}
