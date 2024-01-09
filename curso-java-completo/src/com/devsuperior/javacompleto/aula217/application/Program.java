package com.devsuperior.javacompleto.aula217.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Marlene
 * SE��O 17: Trabalhando com arquivos
 * AULA 217. FileWriter e Buffered Writer
 */

public class Program {
	public static void main(String[] args) {
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
		// try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){    // caso exista, criar� novas linhas 
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
