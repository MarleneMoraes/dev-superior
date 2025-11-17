package com.devsuperior.javacompleto.aula189.application;

import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * @author Marlene 
 * SECAO 17: Generics, Set, Map 
 * AULA 189. Map
 */

public class Program {
	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99771122");
		
		cookies.remove("email");
		cookies.put("phone", "99771133"); // sobrescreve o valor com a mesma chave
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("ALL COOKIES:");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}

}
