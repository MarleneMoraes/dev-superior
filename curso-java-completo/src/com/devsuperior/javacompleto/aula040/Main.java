package com.devsuperior.javacompleto.aula040;

public class Main {

	public static void main(String[] args) {
		double preco = 34.5;
		
		//CONDIÇÃO TERNÁRIA
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05; 
		
		System.out.println(desconto);
	}

}
