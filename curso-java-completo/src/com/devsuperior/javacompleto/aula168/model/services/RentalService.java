package com.devsuperior.javacompleto.aula168.model.services;

import java.time.Duration;

import com.devsuperior.javacompleto.aula167.model.entities.CarRental;
import com.devsuperior.javacompleto.aula167.model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;

	private TaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		double hours = (Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes()) / 60.0;

		double basicPayment;

		if (hours <= 12) {
			basicPayment = pricePerHour * Math.ceil(hours);
		} else {
			basicPayment = pricePerDay * Math.ceil(hours / 24.0);
		}

		double tax = taxService.tax(basicPayment);

		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
