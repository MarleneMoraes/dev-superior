package com.devsuperior.javacompleto.aula095;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author Marlene 
 * SEÇÃO 10: Comportamento de Memória, arrays, listas 
 * AULA 94 e 95 . Listas
 */

public class Program {

	public static void main(String[] args) {
		//Não é permitido instanciar Listas, pois esta é uma interface.
		//List x = new List(); //dará erro
		
		//Lista utiliza a Wrapper Class ao declarar os tipos
		List<String> list = new ArrayList<>(); //ArrayList é uma classe otimizada, que pode ser instanciada
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		//Adicionar um elemento em uma posição específica
		list.add(2, "Marco");
		
		for (String names : list) {
			System.out.print(names + " ");
		}
		
		System.out.println();
		
		//Tamanho da lista
		System.out.println(list.size());
		
		//Encontrar posição dos elementos
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Jonas: " + list.indexOf("Jonas")); //Caso não exista, a lista retornará o valor -1
		
		//Filtrar lista com as condições informadas na função lambda (predicado)
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		
		//Imprimir apenas o primeiro elemento da lista filtrada.
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name); //Alex
		
		name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name); //null
		
		//Remover um valor
		list.remove("Anna"); //compara com os valores da lista
		list.remove(1); //remove o elemento da posição indicada
		list.removeIf(x -> x.charAt(0) == 'M'); //remove o elemento com as condições informadas no predicado
		
		
		for (String names : list) {
			System.out.print(names + " ");
		}

	}

}
