package com.devsuperior.javacompleto.aula131.application;

import com.devsuperior.javacompleto.aula131.entities.Account;
import com.devsuperior.javacompleto.aula131.entities.BusinessAccount;
import com.devsuperior.javacompleto.aula131.entities.SavingsAccount;

/**
 * 
 * @author Marlene 
 * SECAO 13: Heranca e polimorfismo
 * AULA 131. Upcasting e downcating
 */

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);

		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// UPCASTING - casting da subclasse para superclasse
		Account acc1 = bacc; // a BusinessAccount tambem uma conta, sendo perfeitamente possivel atribuir
								// este valor
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

		// DOWNCASTING - casting da superclasse para subclasse
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);

		// BusinessAccount acc5 = (BusinessAccount) acc3; 
			/* erro somente na execucao pois, pela sintaxe, esta correto, mas pela logica, nao
				Exception in thread "main" java.lang.ClassCastException: 
				class com.devsuperior.javacompleto.aula131.entities.SavingsAccount cannot be cast 
				to class com.devsuperior.javacompleto.aula131.entities.BusinessAccount 
				(com.devsuperior.javacompleto.aula131.entities.SavingsAccount and com.devsuperior.javacompleto.aula131.entities.BusinessAccount 
				are in unnamed module of loader 'app') at com.devsuperior.javacompleto.aula131.application.Program.main(Program.java:33)
			*/
			
			// Para resolucao deste downcasting
			if (acc3 instanceof BusinessAccount) {
				BusinessAccount acc5 = (BusinessAccount) acc3;
				acc5.loan(200.0);
				System.out.println("Loan!");
			}
			
			if (acc3 instanceof SavingsAccount) {
				SavingsAccount acc5 = (SavingsAccount) acc3;
				acc5.updateBalance();
				System.out.println("Update!");
			}

	}

}
