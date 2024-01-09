package com.devsuperior.javacompleto.aula243;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author Marlene 
 * SECAO 19: Generics, Set, Map 
 * AULA 243. Set
 */

public class Program {
	public static void main(String[] args) {
		// Set<T> - interface que representa um conjunto de elementos
		// nao admite repeticoes e os elementos nao possuem posicao
		// Oferece operacoes intersecao, uniao, diferenca (ver App.java) 
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("Tv");
		hashSet.add("Tablet");
		hashSet.add("Notebook");
		
		System.out.println(hashSet.contains("Notebook"));
		
		System.out.println("HASHSET");
		for(String item : hashSet) {
			System.out.println(item); // imprime valores nao necessariamente na ordem adicionada
		}
		
		Set<String> treeSet = new TreeSet<>();
		
		treeSet.add("Tv");
		treeSet.add("Tablet");
		treeSet.add("Notebook");
		
		treeSet.remove("Tablet");
		// treeSet.removeIf(x -> x.length() >= 3); // remove os itens que atenderem este predicado
		// treeSet.removeIf(x -> x.charAt(0) == 'T');
		
		System.out.println("TREESET");
		for(String item : treeSet) {
			System.out.println(item); // imprime valores na ordem adicionada
		}
		
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Tv");
		linkedHashSet.add("Tablet");
		linkedHashSet.add("Notebook");
		
		System.out.println("LINKEDHASHSET");
		for(String item : linkedHashSet) {
			System.out.println(item); // imprime valores na ordem adicionada
		}
	}

}
