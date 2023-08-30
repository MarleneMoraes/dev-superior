package com.devsuperior.javacompleto.aula099.labs.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.javacompleto.aula099.labs.entities.Employee;

/**
 * 
 * @author Marlene 
 * SECAO 10: Comportamento de Mem�ria, arrays, listas 
 * AULA 99 - Exerc�cio proposto
 */

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("How many employees will be registered? ");
		int n = scan.nextInt();
		
		List<Employee> employees = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Employee #%d:\n", i+1);
			System.out.print("Id: ");
			int id = scan.nextInt();
			
			System.out.print("Name: ");
			scan.nextLine(); //limpeza do buffer
			String name = scan.nextLine();
			
			System.out.print("Salary: ");
			double salary = scan.nextDouble();
			
			employees.add(new Employee(id, name, salary));
		}
		

		System.out.print("Enter the employee id that will have salary increase: ");
		int filterId = scan.nextInt();
		Employee employeeId = employees.stream().filter(x -> x.getId() == filterId).findFirst().orElse(null);
		
		if (hasId(employees, filterId) == false) { 
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = scan.nextDouble();
			employeeId.increaseSalary(percentage);
		}
		
		System.out.println("\n-------------------");
		System.out.println("List of employees:");
		
		for (Employee employee : employees) {
			System.out.println(employee.toString());
		}
		scan.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return true;
			}
		}
		
		return false;
	}

}
