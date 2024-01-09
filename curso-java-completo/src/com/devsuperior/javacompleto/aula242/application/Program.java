package com.devsuperior.javacompleto.aula242.application;

/**
 * 
 * @author Marlene 
 * SECAO 19: Generics, Set, Map 
 * AULA 242. HashCode e Equals
 */

public class Program {
	public static void main(String[] args) {
		String a = "Maria";
		String b = "Alex";

		// Equals - metodo de comparacao de um objeto a outro
		// vantagens: 100% certo
		// desvantagens: metodo mais lento
		System.out.println(a.equals(b)); // false

		// HashCode - metodo de comparacao de um objeto a outro,
		// atraves do codigo de um numero inteiro gerado pelas
		// informacoes do objeto
		// vantagens: metodo mais rapido
		// desvantagens: por ser representado em numeros inteiros,
		// pode haver colisoes 

		System.out.println(a.hashCode()); // 74113750
		System.out.println(b.hashCode()); // 2043454
	}

}
