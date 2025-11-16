package com.devsuperior.javacompleto.aula150.application;

/**
 * 
 * @author Marlene
 * SECAO 14: Tratamento de Excecoes
 * AULA 150. Terceira solucao - boa
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.devsuperior.javacompleto.aula150.model.entities.Reservation;
import com.devsuperior.javacompleto.aula150.model.exceptions.DomainException;

public class Program {
	//Tratamento de erros
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkin = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkout = sdf.parse(sc.next());
			
			
			Reservation reservation = new Reservation(number, checkin, checkout);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.println("Check-in date (dd/MM/yyyy): ");
			checkin = sdf.parse(sc.next());
			System.out.println("Check-out date (dd/MM/yyyy): ");
			checkout = sdf.parse(sc.next());
			
			reservation.updateDates(checkin, checkout); 
			
			System.out.println("Reservation: " + reservation);			
		}
		catch (ParseException e) {
			System.out.println("Invalid date format");
		}
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch (RuntimeException e) { // excecao possui uma estrutura de heranca e upcasting
			System.out.println("Unexpected error");
		}
		sc.close();
	}

}
