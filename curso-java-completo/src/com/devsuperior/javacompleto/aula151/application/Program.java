package com.devsuperior.javacompleto.aula151.application;

import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.javacompleto.aula151.model.entities.Account;
import com.devsuperior.javacompleto.aula151.model.exceptions.WithdrawException;

/**
 * 
 * @author Marlene 
 * SECAO 14: Tratamento de Excecoes 
 * AULA 151. Exercicio de fixacao
 * 
 */

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Enter account data");

			System.out.print("Number: ");
			int number = scan.nextInt();
			scan.nextLine();

			System.out.print("Holder: ");
			String holder = scan.nextLine();

			System.out.print("Initial balance: ");
			Double balance = scan.nextDouble();
			scan.nextLine();

			System.out.print("Withdraw limit: ");
			Double limit = scan.nextDouble();
			scan.nextLine();
			
			Account account = new Account(number, holder, balance, limit);

			System.out.print("Enter amount for withdraw: ");
			account.withDraw(scan.nextDouble());
			scan.nextLine();

		} catch (WithdrawException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		scan.close();
	}
}