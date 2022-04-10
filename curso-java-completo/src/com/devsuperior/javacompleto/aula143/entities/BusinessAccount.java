package com.devsuperior.javacompleto.aula143.entities;

public class BusinessAccount extends Account {

	private Double loanLimit;

	public BusinessAccount() {
		super(); // chamada de construtor da superclasse (a classe que esta classe herdou)
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // chamada da superclasse com parâmetros
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			this.balance += amount - 10.0;
		}
	}

}
