package com.devsuperior.javacompleto.aula157.application;

import com.devsuperior.javacompleto.aula157.entities.Account;
import com.devsuperior.javacompleto.aula157.entities.BusinessAccount;
import com.devsuperior.javacompleto.aula157.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);

		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// UPCASTING
		Account acc1 = bacc; // a BusinessAccount tamb�m uma conta, sendo perfeitamente poss�vel atribuir
								// este valor
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

		// DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);

		//BusinessAccount acc5 = (BusinessAccount) acc3; 
			/* erro somente na execu��o pois, pela sintaxe, est� correto, mas pela l�gica, n�o
				Exception in thread "main" java.lang.ClassCastException: 
				class com.devsuperior.javacompleto.aula126.entities.SavingsAccount cannot be cast 
				to class com.devsuperior.javacompleto.aula126.entities.BusinessAccount 
				(com.devsuperior.javacompleto.aula126.entities.SavingsAccount and com.devsuperior.javacompleto.aula126.entities.BusinessAccount 
				are in unnamed module of loader 'app') at com.devsuperior.javacompleto.aula126.application.Program.main(Program.java:25)
			*/
			
			//Para resolu��o deste downcasting
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
