package com.devsuperior.javacompleto.aula139.labs.entities;

public class Company extends TaxPayer {
	private int qtdEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, int qtdEmployees) {
		super(name, anualIncome);
		this.qtdEmployees = qtdEmployees;
	}

	public int getQtdEmployees() {
		return qtdEmployees;
	}

	public void setQtdEmployees(int qtdEmployees) {
		this.qtdEmployees = qtdEmployees;
	}

	@Override
	public Double tax() {
		Double totalTax = getAnualIncome();
		
		if (getQtdEmployees() > 10) {
			totalTax *= 0.14;
		} else {
			totalTax *= 0.16;
		}
		return totalTax;
	}
}
