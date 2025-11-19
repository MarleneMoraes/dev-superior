package com.devsuperior.javacompleto.aula113;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * 
 * @author Marlene
 * SECAO 11: Topicos especiais em Java: data-hora
 * AULA 113. Convertendo data-hora global para local
 */

public class Program {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.parse("2022-07-20");
		LocalDateTime localDateTime = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant instant = Instant.parse("2022-07-20T01:30:26Z");
		
		// Converter uma data global Instant para uma data local
		localDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate localDatePortugal = instant.atZone(ZoneId.of("Europe/Lisbon")).toLocalDate();
		
		localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		LocalDateTime localDateTimePortugal = LocalDateTime.ofInstant(instant, ZoneId.of("Portugal"));
		
		System.out.println(localDate); // 2022-07-19
		System.out.println(localDatePortugal); // 2022-07-20
		
		System.out.println(localDateTime); // 2022-07-19T22:30:26
		System.out.println(localDateTimePortugal); // 2022-07-20T02:30:26
		
		// Elementos da data
		System.out.println("Dia " + localDate.getDayOfMonth());
		System.out.println("Mes " + localDate.getMonthValue());
		System.out.println("Ano " + localDate.getYear());
		
		System.out.println("Hora " + localDateTime.getHour());
		System.out.println("Minutos " + localDateTime.getMinute());
		
		System.out.println("AVAILABLE ZONE COLLECTION");
		for (String zone : ZoneId.getAvailableZoneIds()) {
			System.out.println(zone);
		}
	}

}
