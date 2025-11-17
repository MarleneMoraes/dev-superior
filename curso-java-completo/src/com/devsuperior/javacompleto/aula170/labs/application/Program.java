package com.devsuperior.javacompleto.aula170.labs.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.javacompleto.aula170.labs.model.entities.Contract;
import com.devsuperior.javacompleto.aula170.labs.model.entities.Installment;
import com.devsuperior.javacompleto.aula170.labs.model.services.ContractService;
import com.devsuperior.javacompleto.aula170.labs.model.services.PaypalService;

/**
 * 
 * @author Marlene 
 * SECAO 16: Interfaces 
 * AULA 170. Exercicio de fixacao
 * 
 */

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Contract contract = new Contract();		
		
		System.out.println("Enter contract data: ");
		System.out.print("Number: ");
		contract.setNumber(scan.nextInt());
		scan.nextLine();
		
		System.out.print("Date (DD/MM/YYYY): ");
		contract.setDate(LocalDate.parse(scan.next(), date));
		scan.nextLine();
		
		System.out.print("Total Value: ");
		contract.setTotalValue(scan.nextDouble());
		scan.nextLine();
		
		System.out.print("Enter for number of installments: ");
		int installmentsNumber = scan.nextInt();
		scan.nextLine();
		
		scan.close();
		
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, installmentsNumber);	;
		
		System.out.println("Installments:");
		for(Installment installment : contract.getInstallments()) {
			System.out.println(installment.toString());		
		}
		
	}

}
