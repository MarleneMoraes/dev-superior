package com.devsuperior.javacompleto.aula082.labs.application;

/**
 * 
 * @author Marlene
 * SEÇÃO 9: Construtores, palavra this, sobrecarga, encapsulamento
 * AULA 82. Exercicio de fixação
 */

import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.javacompleto.aula082.labs.entities.Account;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int accountNumber = scanner.nextInt();
		
		System.out.print("Enter account holder: ");
		scanner.nextLine();
		String accountHolder = scanner.nextLine();
		
		System.out.print("Is there an initial deposit? (y/n) ");
		char answer = scanner.next().charAt(0);
		
		if (answer == 'y' || answer == 'Y') {
			System.out.print("Enter initial value: ");
			double initialDeposit = scanner.nextDouble();
			account = new Account(accountNumber, accountHolder, initialDeposit);
		} else {
			account = new Account(accountNumber, accountHolder);
		}
		
		System.out.println("\nAccount data:");
		System.out.println(account);
		
		System.out.println("\nEnter a deposit value: ");
		double depositValue = scanner.nextDouble();
		account.deposit(depositValue);
		
		System.out.println("\nUpdate account data:");
		System.out.println(account);
		
		System.out.println("\nEnter a withdraw value: ");
		double withdrawValue = scanner.nextDouble();
		account.withdraw(withdrawValue);
		
		System.out.println("\nUpdate account data:");
		System.out.println(account);
		
		scanner.close();
	}

}