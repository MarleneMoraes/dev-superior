package com.devsuperior.javacompleto.aula214.application;

/**
 * 
 * @author Marlene
 * SE��O 17: Trabalhando com arquivos
 * AULA 214. Lendo arquivo texto com classes File e Scanner
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) { 
		//Objeto que encapsula as opera��es do file
		File file = new File("c:\\temp\\in.txt");
		
		//Instanciar o Scanner a partir do file
		Scanner sc = null;
		//Tentativa de abrir o arquivo pode gerar uma exce��o do tipo IOException
		try {
			sc = new Scanner(file);
			
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} 
		catch (IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close(); //boas pr�ticas
			}
		}
		
	}

}
