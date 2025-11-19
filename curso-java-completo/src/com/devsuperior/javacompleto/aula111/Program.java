package com.devsuperior.javacompleto.aula111;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @author Marlene
 * SECAO 11: Topicos especiais em Java: data-hora
 * AULA 111. Instanciando data-hora em Java
 */

public class Program {

	public static void main(String[] args) {
		// Data-hora local
		LocalDate localDate = LocalDate.now(); // data do sistema utilizado e instancia do tipo LocalDate
		
		LocalDateTime localDateTime = LocalDateTime.now(); // data e hora do sistema utilizado e instancia do tipo LocalDateTime
		
		System.out.println("ld = " + localDate);
		System.out.println("ldt = " + localDateTime);
		
		// Data-hora global
		Instant instant = Instant.now(); // data e hora GMT
		
		System.out.println("i = " + instant);
		
		// Texto ISO 8601 (formato de Data-hora)
		LocalDate iso = LocalDate.parse("2022-07-20");
		
		System.out.println("iso = " + iso);
		
		iso = LocalDate.parse("2022-07-20T01:30:26");
		
		System.out.println("iso = " + iso);
		
		instant = Instant.parse("2022-07-20T01:30:26"); // caso coloque o Z, imprime o horario indicado
		System.out.println("i in ISO 8601 = " + instant);

		// Texto com formato customizado
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // classe que transforma strings em formato de data-hora
		DateTimeFormatter dateTimeFormatterWithHour = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		localDate = LocalDate.parse("20/07/2022", dateTimeFormatter); // localDate = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		localDate = LocalDate.parse("20/07/2022 01:30", dateTimeFormatterWithHour);
		
		System.out.println("ld with dtf = " + localDate);
		System.out.println("ld with dtfh = " + localDate);
		
		// Dados isolados
		localDate = LocalDate.of(2022, 07, 20);
		localDateTime = LocalDateTime.of(2022, 07, 20, 01, 30);
		
		System.out.println("dados isolados ld = " + localDate);
		System.out.println("dados isolados ldt = " + localDateTime);
		
		// Duracao 
		Duration duration;
	}

}
