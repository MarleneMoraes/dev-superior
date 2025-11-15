package com.devsuperior.javacompleto.aula120.application;

import java.util.Date;

import com.devsuperior.javacompleto.aula120.entities.Order;
import com.devsuperior.javacompleto.aula120.entities.enums.OrderStatus;

/**
 * 
 * @author Marlene
 * SECAO 12: Enumeracoes, composicao
 * AULA 120. Enumeracoes
 */

public class Program {
	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		
		// Conversao de String para enum
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); // Retorna para aplicacao o valor enum que entrou como String
		
		System.out.println(os1); // DELIVERED
		System.out.println(os2); // DELIVERED
	}
	
}
