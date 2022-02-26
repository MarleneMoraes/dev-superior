package com.devsuperior.javacompleto.aula103;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(d);
		
		//Somar unidade de tempo
		calendar.add(Calendar.HOUR_OF_DAY, 4);
		d = calendar.getTime();
		System.out.println(sdf.format(d));
		
		//Obter unidade de tempo
		int minutes = calendar.get(Calendar.MINUTE);
		int month = 1 + calendar.get(Calendar.MONTH); //janeiro é o mês 0, por isso que acrescenta 1
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
	}

}
