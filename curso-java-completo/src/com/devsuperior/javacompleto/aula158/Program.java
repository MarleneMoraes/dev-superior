package com.devsuperior.javacompleto.aula158;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Marlene
 * SECAO 15: Trabalhando com arquivos
 * AULA 158. FileWriter e BufferedWriter
 */

public class Program {
	public static void main(String[] args) {
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
		// try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {    // caso exista, criara novas linhas 
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}