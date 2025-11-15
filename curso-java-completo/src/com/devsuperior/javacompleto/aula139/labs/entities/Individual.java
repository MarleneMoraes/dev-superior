package com.devsuperior.javacompleto.aula139.labs.entities;

public class Individual extends TaxPayer {
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		Double totalTax = getAnualIncome();
		
		if(getAnualIncome() < 20000.00) {
			totalTax *= 0.15;
		} else {
			totalTax *= 0.25;
		}
		
		if(getHealthExpenditures() > 0) {
			totalTax -= (getHealthExpenditures() * 0.5);
		}
		
		return totalTax;
	}

}
