package com.devsuperior.javacompleto.aula073.labs.util;

public class CurrencyConverter {
	public static final double IOF = 0.06; 
	
	public static double reaisPrice(double dollarPrice, double dollarBought) {
		return dollarPrice * dollarBought + (dollarPrice * dollarBought * IOF);
	}
	
}
