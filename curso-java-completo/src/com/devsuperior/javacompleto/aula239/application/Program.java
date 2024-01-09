package com.devsuperior.javacompleto.aula239.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.devsuperior.javacompleto.aula239.entities.Product;
import com.devsuperior.javacompleto.aula239.services.CaculationService;

/**
 * 
 * @author Marlene 
 * SECAO 19: Generics, Set, Map 
 * AULA 239. Generics delimitados
 */

public class Program {
	/*
	 * Problema 
	 * Uma empresa de consultoria deseja encontrar o maior dentre um conjunto
	 * de elementos. Faca um programa que leia um conjunto de produtos a partir
	 * de um arquivo e depois mostre o mais caro deles.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		String path = "C:\\in.txt";
		
		try(BufferedReader reader = new BufferedReader(new FileReader(path))){
			
			String line = reader.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = reader.readLine();
			}
			
			Product product = CaculationService.max(list);
			System.out.println("Most expensive: " + product);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

	
	
	
}
