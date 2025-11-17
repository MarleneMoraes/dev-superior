package com.devsuperior.javacompleto.aula180.services;

import java.util.List;

public class CalculationService {
	// <T> - declaracao para trabalhar com o tipo T
	// extends Comparable - especificacao que o tipo T e um tipo Comparable
	public static <T extends Comparable<T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}

		T max = list.get(0);

		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}