package com.devsuperior.javacompleto.aula095;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author Marlene 
 * SE��O 10: Comportamento de Mem�ria, arrays, listas 
 * AULA 94 e 95 . Listas
 */

public class Program {

	public static void main(String[] args) {
		//N�o � permitido instanciar Listas, pois esta � uma interface.
		//List x = new List(); //dar� erro
		
		//Lista utiliza a Wrapper Class ao declarar os tipos
		List<String> list = new ArrayList<>(); //ArrayList � uma classe otimizada, que pode ser instanciada
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		//Adicionar um elemento em uma posi��o espec�fica
		list.add(2, "Marco");
		
		for (String names : list) {
			System.out.print(names + " ");
		}
		
		System.out.println();
		
		//Tamanho da lista
		System.out.println(list.size());
		
		//Encontrar posi��o dos elementos
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Jonas: " + list.indexOf("Jonas")); //Caso n�o exista, a lista retornar� o valor -1
		
		//Filtrar lista com as condi��es informadas na fun��o lambda (predicado)
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
		list.remove(1); //remove o elemento da posi��o indicada
		list.removeIf(x -> x.charAt(0) == 'M'); //remove o elemento com as condi��es informadas no predicado
		
		
		for (String names : list) {
			System.out.print(names + " ");
		}

	}

}
