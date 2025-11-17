package com.devsuperior.javacompleto.aula170.labs.model.services;

public interface OnlinePaymentService {
	
	double paymentFee(double amount);
	double interest(double amount, int installments);
	
}
