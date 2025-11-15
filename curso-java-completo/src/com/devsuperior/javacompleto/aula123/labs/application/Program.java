package com.devsuperior.javacompleto.aula123.labs.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.javacompleto.aula123.labs.entities.Department;
import com.devsuperior.javacompleto.aula123.labs.entities.HourContract;
import com.devsuperior.javacompleto.aula123.labs.entities.Worker;
import com.devsuperior.javacompleto.aula123.labs.entities.enums.WorkerLevel;

/**
 * 
 * @author Marlene 
 * SECAO 12: Enumeracoes, composicao
 * AULA 123. Exercicio resolvido 1
 */


public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		Department department = new Department(scan.nextLine());
		
		System.out.println("Enter worker data:");
		Worker worker = new Worker();
		
		System.out.print("Name: ");
		worker.setName(scan.nextLine());
		
		System.out.print("Level: ");
		worker.setLevel(WorkerLevel.valueOf(scan.nextLine()));
		
		System.out.print("Base salary: ");
		worker.setBaseSalary(scan.nextDouble());
		
		worker.setDepartment(department);

		System.out.print("How many contracts to this worker? ");
		int qtdContracts = scan.nextInt();
		
		for(int i = 0; i < qtdContracts; i++) {
			System.out.printf("Enter contract #%d data: %n", i + 1);
			HourContract contract = new HourContract();
			
			System.out.print("Date(DD/MM/YYYY): ");
			contract.setDate(date.parse(scan.next()));
			
			System.out.print("Value per hour: ");
			contract.setValuePerHour(scan.nextDouble());
			scan.nextLine();
			
			System.out.print("Duration (hours): ");
			contract.setHours(scan.nextInt());
			
			worker.addContract(contract);
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String output = scan.next();
		int month = Integer.parseInt(output.substring(0, 2));
		int year = Integer.parseInt(output.substring(3));
		
		System.out.println(worker.toString(month, year));
		scan.close();
	}

}
