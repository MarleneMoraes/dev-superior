package com.devsuperior.javacompleto.aula146;

/**
 * 
 * @author Marlene
 * SE��O 14: Heran�a e polimorfismo
 * AULA 146. Classe e m�todos final 
 */


public class Account {
	protected Integer number;
	protected String holder;
	protected Double balance; 
	
	public Account() { }
	
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withDraw(double amount) {
		this.balance -= amount + 5.0;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	
}
