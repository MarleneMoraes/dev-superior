package com.devsuperior.javacompleto.aula040;

/**
 * 
 * @author Marlene
 * SE��O 5: Estrutura condicional
 * AULA 40. Express�o condicional tern�ria
 */

public class Main {

	public static void main(String[] args) {
		double preco = 34.5;
		
		//CONDI��O TERN�RIA
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05; 
		
		System.out.println(desconto);
	}

}
