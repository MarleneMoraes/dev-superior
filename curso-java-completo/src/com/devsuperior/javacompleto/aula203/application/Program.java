package com.devsuperior.javacompleto.aula203.application;

/**
 * 
 * @author Marlene
 * SEÇÃO 17: Trabalhando com arquivos
 * AULA 203. Bloco try-with-resources
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {
		/*
		 * Bloco try-with-resources Disponível a partir do Java 7
		 * 
		 * Declaração de um ou mais recursos, garantindo que esses recursos serão
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
