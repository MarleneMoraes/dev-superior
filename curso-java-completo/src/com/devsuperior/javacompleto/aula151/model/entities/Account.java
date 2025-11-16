package com.devsuperior.javacompleto.aula151.model.entities;

import com.devsuperior.javacompleto.aula151.model.exceptions.WithdrawException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() { }

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
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

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void withDraw(double amount) {
		if(amount > getWithdrawLimit()) {
			throw new WithdrawException("The amount exceeds withdraw limit");
		}
		
		if(amount > balance) {
			throw new WithdrawException("Not enough balance");
		}
		
		System.out.printf("New balance: %.2f", (this.balance -= amount));
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
}