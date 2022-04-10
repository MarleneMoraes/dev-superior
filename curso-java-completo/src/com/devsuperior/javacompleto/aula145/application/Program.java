package com.devsuperior.javacompleto.aula145.application;

/**
 * 
 * @author Marlene
 * SEÇÃO 14: Herança e polimorfismo
 * AULA 145. Sobreposição, palavra super, anotação @Override 
 */


import com.devsuperior.javacompleto.aula145.entities.Account;
import com.devsuperior.javacompleto.aula145.entities.BusinessAccount;
import com.devsuperior.javacompleto.aula145.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account aacc = new Account(1001, "Alex", 1000.0);
		aacc.withDraw(200.0);
		System.out.println(aacc.getBalance());

		Account macc = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		macc.withDraw(200.0);
		System.out.println(macc.getBalance());
		
		Account bacc = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		bacc.withDraw(200.0);
		System.out.println(bacc.getBalance());
	}

}
