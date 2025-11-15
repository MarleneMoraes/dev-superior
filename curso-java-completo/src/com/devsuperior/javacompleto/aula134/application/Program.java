package com.devsuperior.javacompleto.aula134.application;

import com.devsuperior.javacompleto.aula134.entities.Account;
import com.devsuperior.javacompleto.aula134.entities.SavingsAccount;

/**
 * 
 * @author Marlene 
 * SECAO 13: Heranca e polimorfismo
 * AULA 134. Introducao ao polimorfismo
 */

public class Program {

	public static void main(String[] args) {
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		// Variaveis sao do mesmo tipo, porem possuem comportamentos diferentes conforme os objetos
		// os quais elas apontam
		x.withDraw(50.0);
		y.withDraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
