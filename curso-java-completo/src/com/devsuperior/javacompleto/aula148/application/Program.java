package com.devsuperior.javacompleto.aula148.application;

/**
 * 
 * @author Marlene
 * SECAO 14: Tratamento de Excecoes
 * AULA 148. Primeira solucao - muito ruim
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.devsuperior.javacompleto.aula148.model.entities.Reservation;

public class Program {
	//Essa solucao deveria estar na classe Reservation
	public static void main(String[] args) throws ParseException { // ParseException propaga a excecao que a IDE identificou como possivel excecao
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkin = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkout = sdf.parse(sc.next());
		
		if(!checkout.after(checkin)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		} else {
			Reservation reservation = new Reservation(number, checkin, checkout);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.println("Check-in date (dd/MM/yyyy): ");
			checkin = sdf.parse(sc.next());
			System.out.println("Check-out date (dd/MM/yyyy): ");
			checkout = sdf.parse(sc.next());
			
			Date now = new Date();
			if (checkin.before(now) || checkout.before(now)) {
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
			} else if (!checkout.after(checkin)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");
			} else {
				reservation.updateDates(checkin, checkout);
				System.out.println("Reservation: " + reservation);
			}
		}
		
		sc.close();
	}

}
