package com.devsuperior.javacompleto.aula110;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @author Marlene
 * SECAO 11: Topicos especiais em Java: data-hora
 * AULA 110. Instanciando data-hora em Java
 */

public class Program {

	public static void main(String[] args) {
		// Data-hora local
		LocalDate ld = LocalDate.now(); // data do sistema utilizado e instancia do tipo LocalDate
		
		LocalDateTime ldt = LocalDateTime.now(); // data e hora do sistema utilizado e instancia do tipo LocalDateTime
		
		System.out.println("ld = " + ld);
		System.out.println("ldt = " + ldt);
		
		// Data-hora global
		Instant i = Instant.now(); // data e hora GMT
		
		System.out.println("i = " + i);
		
		// Texto ISO 8601 (formato de Data-hora)
		LocalDate iso = LocalDate.parse("2022-07-20");
		
		System.out.println("iso = " + iso);
		
		iso = LocalDate.parse("2022-07-20T01:30:26");
		
		System.out.println("iso = " + iso);
		
		i = Instant.parse("2022-07-20T01:30:26"); // caso coloque o Z, imprime o horario indicado
		System.out.println("i in ISO 8601 = " + i);

		// Texto com formato customizado
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // classe que transforma strings em formato de data-hora
		DateTimeFormatter dtfh = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		ld = LocalDate.parse("20/07/2022", dtf); // ld = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		ld = LocalDate.parse("20/07/2022 01:30", dtfh);
		
		System.out.println("ld with dtf = " + ld);
		System.out.println("ld with dtfh = " + ld);
		
		// Duracao 
		Duration d;
	}

}
