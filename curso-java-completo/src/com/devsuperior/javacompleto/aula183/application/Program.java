package com.devsuperior.javacompleto.aula183.application;

/**
 * 
 * @author Marlene 
 * SECAO 17: Generics, Set, Map 
 * AULA 183. HashCode e Equals
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
