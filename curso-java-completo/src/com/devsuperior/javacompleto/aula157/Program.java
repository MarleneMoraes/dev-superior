package com.devsuperior.javacompleto.aula157;

/**
 * 
 * @author Marlene
 * SECAO 15: Trabalhando com arquivos
 * AULA 157. Bloco try-with-resources
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {
		/*
		 * Bloco try-with-resources Disponivel a partir do Java 7
		 * 
		 * Declaracao de um ou mais recursos, garantindo que esses recursos serao
		 * fechados ao final do bloco.
		 */

		String path = "c:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
