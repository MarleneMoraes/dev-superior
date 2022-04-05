package com.devsuperior.javacompleto.aula082.labs.entities;

public class Account {
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public Account() { }	
	
	public Account(int numberAccount, String nameHolder) {
		this.accountNumber = numberAccount;
		this.accountHolder = nameHolder;
	}

	public Account(int numberAccount, String nameHolder, double initialDeposit) {
		this.accountNumber = numberAccount;
		this.accountHolder = nameHolder;
		deposit(initialDeposit);
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public double withdraw(double amount) {
		if (balance > 0) {
			return balance -= (amount + 5.0);
		} else {
			return balance;
		}
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public String toString() {
		return "Account " + this.accountNumber + ", Holder: " + this.accountHolder + 
				", Balance: $ " + String.format("%.2f", this.balance);
	}
}
