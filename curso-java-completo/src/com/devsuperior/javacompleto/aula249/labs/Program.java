package com.devsuperior.javacompleto.aula249.labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author Marlene 
 * SECAO 19: Generics, Set, Map 
 * AULA 249. Exercicio de fixacao (Map)
 */

public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> candidates = new HashMap<>();

		System.out.print("Enter file full path");
		String path = scan.nextLine();

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			String line = bufferedReader.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int votes = Integer.parseInt(fields[1]);

				if (candidates.containsKey(name)) {
					int newVotes = candidates.get(name);
					candidates.put(name, (votes + newVotes));
				} else {
					candidates.put(name, votes);
				}

				line = bufferedReader.readLine();
			}

			for (String name : candidates.keySet()) {
				System.out.println(name + ": " + candidates.get(name));
			}

		} catch (IOException e) {
			System.out.println("ERROR");
			System.out.println(e.getMessage());
		}

		scan.close();
	}

}
