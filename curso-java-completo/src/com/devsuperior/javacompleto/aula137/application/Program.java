package com.devsuperior.javacompleto.aula137.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.devsuperior.javacompleto.aula137.entities.Account;
import com.devsuperior.javacompleto.aula137.entities.BusinessAccount;
import com.devsuperior.javacompleto.aula137.entities.SavingsAccount;

/**
 * 
 * @author Marlene
 * SECAO 13: Heranca e polimorfismo
 * AULA 137. Classes abstratas 
 */

public class Program {

	public static void main(String[] args) {
		// Account acc1 = new Account(1001, "Alex", 1000.0); // Cannot instantiate the type Account
		// Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		// Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.00);
		
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: $ %.2f%n", sum);
		
		for (Account acc : list) {
			acc.deposit(10.0);
			System.out.printf("Updated balance for account %d: $ %.2f%n", 
					acc.getNumber(), acc.getBalance());
		}
		
		
	}

}
