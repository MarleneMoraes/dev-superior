package com.devsuperior.javacompleto.aula133;

public final class SavingsAccount extends Account {
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}


	public Double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	// em caso de final nesta classe, impedira que subclasses o sopreponham
	@Override
	public final void withDraw(double amount) {
		this.balance -= amount;
	}
	
}
