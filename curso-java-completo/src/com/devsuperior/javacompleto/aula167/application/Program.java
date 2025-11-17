package com.devsuperior.javacompleto.aula167.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.javacompleto.aula167.model.entities.CarRental;
import com.devsuperior.javacompleto.aula167.model.entities.Vehicle;
import com.devsuperior.javacompleto.aula167.model.services.BrazilTaxService;
import com.devsuperior.javacompleto.aula167.model.services.RentalService;

/**
 * 
 * @author Marlene 
 * SECAO 16: Interfaces 
 * AULA 167. Solucao do Problema - Parte 2 (sem interface)
 * 
 */

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println("Enter rental data: ");
		System.out.print("Car model: ");
		String carModel = scan.nextLine();

		System.out.print("Pickup (DD/MM/YYYY) hh:mm: ");
		LocalDateTime pickupDate = LocalDateTime.parse(scan.nextLine(), date);

		System.out.print("Return (DD/MM/YYYY) hh:mm: ");
		LocalDateTime returnDate = LocalDateTime.parse(scan.nextLine(), date);

		CarRental rental = new CarRental(pickupDate, returnDate, new Vehicle(carModel));

		System.out.print("Enter price per hour: ");
		Double pricePerHour = scan.nextDouble();
		scan.nextLine();

		System.out.print("Enter price per day: ");
		Double pricePerDay = scan.nextDouble();
		scan.nextLine();

		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

		rentalService.processInvoice(rental);

		System.out.println("INVOICE:");
		System.out.println(rental.getInvoice().toString());

		scan.close();

	}

}
