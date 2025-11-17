package com.devsuperior.javacompleto.aula173.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.devsuperior.javacompleto.aula175.entities.Employee;

/**
 * 
 * @author Marlene 
 * SECAO 16: Interfaces 
 * AULA 175. Interface Comparable
 * 
 */

public class Program {
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		String path = "C:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String csvData = br.readLine();
			
			while (csvData != null) {
				String[] employeeData = csvData.split(",");
				employees.add(new Employee(employeeData[0], Double.parseDouble(employeeData[1])));
				csvData = br.readLine();
			}
			
			
			// Collections.sort deixa de ordenar a lista caso transforme String em objeto que nao e tipo Comparable
			// The method sort(List<T>) in the type Collections is not applicable for the arguments (List<Employee>)
			Collections.sort(employees); // forma de ordenar uma colecao
			
			for (Employee employee : employees) {
				System.out.println(employee.toString());
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}