package com.devsuperior.javacompleto.aula114;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * 
 * @author Marlene
 * SECAO 11: Topicos especiais em Java: data-hora
 * AULA 114. Cálculos com data-hora
 */

public class Program {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.parse("2022-07-20");
		LocalDateTime localDateTime = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant instant = Instant.parse("2022-07-20T01:30:26Z");
		
		// Acrescenta ou diminui dias meses anos ou semanas
		LocalDate pastWeekLocalDate = localDate.minusDays(7);
		LocalDate nextWeekLocalDate = localDate.plusDays(7);
		
		System.out.println("Semana anterior: " + pastWeekLocalDate);
		System.out.println("Próxima semana: " + nextWeekLocalDate);
		
		// Acrescenta ou diminui dias meses anos semanas horas minutos segundos nanossegundos
		LocalDateTime pastWeekLocalDateTime = localDateTime.minusDays(7);
		LocalDateTime nextWeekLocalTimeDate = localDateTime.plusDays(7);
		
		System.out.println("Semana anterior: " + pastWeekLocalDateTime);
		System.out.println("Próxima semana: " + nextWeekLocalTimeDate);
		
		
		// Acrescenta ou diminui dias meses anos semanas etc em conversao unit
		Instant pastWeekInstant = instant.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = instant.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Semana anterior: " + pastWeekInstant);
		System.out.println("Próxima semana: " + nextWeekInstant);
		
		
		// Calcular Duracao
		Duration durationLocalDateTime = Duration.between(pastWeekLocalDateTime, localDateTime);
		System.out.println(durationLocalDateTime.toDays() + " dias");
		
		// Converter LocalDate para LocalDateTime comecando a meia-noite para calculo da duracao
		Duration durationLocalDate = Duration.between(pastWeekLocalDate.atStartOfDay(), localDate.atStartOfDay());
		System.out.println(durationLocalDate.toDays() + " dias");
		
		Duration durationInstant = Duration.between(pastWeekInstant, instant);
		System.out.println(durationInstant.toDays() + " dias");
		
		// caso a primeira data seja posterior a segunda, retorna o valor negativo
		Duration durationNegative = Duration.between(instant, pastWeekInstant);
		System.out.println(durationNegative.toDays() + " dias");
	}

}
