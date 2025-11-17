package com.devsuperior.javacompleto.aula166.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.javacompleto.aula166.model.entities.CarRental;
import com.devsuperior.javacompleto.aula166.model.entities.Vehicle;

/**
 * 
 * @author Marlene 
 * SECAO 16: Interfaces 
 * AULA 166. Solucao do Problema - Parte 1
 */

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.print("Enter rental data: ");
		System.out.print("Car model: ");
		String carModel = scan.nextLine();
		
		System.out.print("Pickup (DD/MM/YYYY) hh:mm: ");
		LocalDateTime pickupDate = LocalDateTime.parse(scan.nextLine(), date);

		System.out.print("Return (DD/MM/YYYY) hh:mm: ");
		LocalDateTime returnDate = LocalDateTime.parse(scan.nextLine(), date);
	
		CarRental rental = new CarRental (pickupDate, returnDate, new Vehicle(carModel));
		
		scan.close();
	}

}
