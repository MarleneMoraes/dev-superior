package com.devsuperior.javacompleto.aula204.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Marlene
 * SEÇÃO 17: Trabalhando com arquivos
 * AULA 204. FileWriter e Buffered Writer
 */

public class Program {
	public static void main(String[] args) {
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
		// try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){    // caso exista, criará novas linhas 
			for(String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
