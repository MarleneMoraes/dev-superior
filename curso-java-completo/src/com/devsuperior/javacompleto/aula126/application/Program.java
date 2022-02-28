package com.devsuperior.javacompleto.aula126.application;

import com.devsuperior.javacompleto.aula126.entities.Account;
import com.devsuperior.javacompleto.aula126.entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
				
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		Account acc1 = bacc; //a BusinessAccount também uma 

	}

}
