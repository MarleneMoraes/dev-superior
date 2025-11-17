package com.devsuperior.javacompleto.aula168.model.services;

public interface TaxService { // Enfraquecimento do acoplamento entre RentalService -> BrazilTaxService
								// Com a interface, ha menos pontos de alteracao para mudancas futuras
	
	double tax(double amount);
	
}
