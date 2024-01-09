package com.devsuperior.javacompleto.aula159;

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
	
	//a nota��o override auxiliar� o programador a checar o polimorfismo deste m�todo
	@Override
	public final void withDraw(double amount) {
		this.balance -= amount;
	}
	
}
