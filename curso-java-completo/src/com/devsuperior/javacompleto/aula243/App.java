package com.devsuperior.javacompleto.aula243;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

		// union - uniao das duas colecoes
		Set<Integer> unionSet = new TreeSet<>(a);
		unionSet.addAll(b);
		System.out.println(unionSet); // [0, 2, 4, 5, 6, 7, 8, 9, 10]
		
		// intersection - uniao dos elementos em comum do conjunto
		Set<Integer> intersectionSet = new TreeSet<>(a);
		intersectionSet.retainAll(b);
		System.out.println(intersectionSet); // [5, 6, 8, 10]
		
		// difference - remocao do primeiro conjunto os elementos 
		// que tambem pertence ao segundo conjunto
		Set<Integer> differenceSet = new TreeSet<>(a);
		differenceSet.removeAll(b);
		System.out.println(differenceSet); // [0, 2, 4]
	}
}
