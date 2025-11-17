package com.devsuperior.javacompleto.aula176.services;

import java.security.InvalidParameterException;

public interface InterestService {
	// Interfaces nao podem armazenar estados, cabendo a classe que a implementa fazer
	// assim como construtor
	double getInterestRate();

	// Default methods nao tem necessidade de implementacao nas subclasses por ser padrao
	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}
}
