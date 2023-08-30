package com.devsuperior.javacompleto.aula115;

/**
 * 
 * @author Marlene
 * SECAO 11: Topicos especiais em Java: data-hora
 * AULA 115. Trabalhando com datas - Date
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); //ISO 8601
		
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y3);
		
		//Para formatar as datas como escreve, utiliza-se o m�todo format
		System.out.println("y1: " + sdf1.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		
		Date x1 = new Date(); //data atual
		System.out.println("x1: " + sdf2.format(x1));
		
		Date x2 = new Date(System.currentTimeMillis()); //intante do sistema utilizado, convertido em milissegundos
		System.out.println("x2: " + sdf2.format(x2));
		
		Date x3 = new Date(0L); //intante do sistema utilizado. No caso do Brasil, � 3hs antes do formato que o java adota (UTC)
		System.out.println("x3: " + sdf2.format(x3)); //imprime 3hs antes do formato do Java
		
		System.out.println("------------------------------");
		//Formato UTC 
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));

	}
}
