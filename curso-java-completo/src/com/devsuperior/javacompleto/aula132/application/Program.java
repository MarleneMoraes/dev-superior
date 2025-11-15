package com.devsuperior.javacompleto.aula132.application;

import com.devsuperior.javacompleto.aula132.entities.Account;
import com.devsuperior.javacompleto.aula132.entities.BusinessAccount;
import com.devsuperior.javacompleto.aula132.entities.SavingsAccount;

/**
 * 
 * @author Marlene 
 * SECAO 13: Heranca e polimorfismo
 * AULA 132. Sobreposicao, palavra super, anotacao @Override
 */

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
