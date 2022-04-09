package com.devsuperior.javacompleto.aula202.application;

/**
 * 
 * @author Marlene
 * SEÇÃO 17: Trabalhando com arquivos
 * AULA 202. FileReader e BufferedReader
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {
		String path = "c:\\temp\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;

		// Tentativa de abertura de arquivo
		try {
			// Flexibilidade e rapidez na abertura de arquivos
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			// br = new BufferedReader(new FileReader(path));

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				}

				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
