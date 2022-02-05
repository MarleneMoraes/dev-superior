package com.devsuperior.javacompleto.aula041;

public class Main {

	public static void main(String[] args) {
		
		//ESCOPO E INICIALIZAÇÃO
		
		double price = 400.00;
		
		double discount = 0;
		
		if (price < 200.00) {
			//double discount = price * 0.1;
			discount = price * 0.1;
		} else {
			discount = 0;
		}
		
		System.out.println(discount);

	}

}
