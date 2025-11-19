package com.devsuperior.javacompleto.aula112;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @author Marlene
 * SECAO 11: Topicos especiais em Java: data-hora
 * AULA 112. Convertendo data-hora para texto
 */

public class Program {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.parse("2022-07-20");
		LocalDateTime localDateTime = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant instant = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatterHour = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Date-Time Formatter");
		System.out.println(localDate.format(formatter));
		System.out.println(formatter.format(localDate)); // nao importa a ordem
		System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // instanciacao direta, nao ha reaproveitamento
		
		System.out.println(localDateTime.format(formatter));
		System.out.println(localDateTime.format(formatterHour));
		
		// o Instant nao possui o format, pois nao esta em horario local
		// devera especificar o fuso antes de utilizar no Instant
		// o DateTimeFormatter lancara uma excessao caso nao especifique 
		// o fuso para Instant
		DateTimeFormatter formatterHourWithZone = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		System.out.println(formatterHourWithZone.format(instant));
		
		// Predefined Formatters
		DateTimeFormatter preformatterISO = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println(localDateTime.format(preformatterISO));
		
		DateTimeFormatter preformatterISOINSTANT = DateTimeFormatter.ISO_INSTANT;
		System.out.println(preformatterISOINSTANT.format(instant));
		
	}

}
