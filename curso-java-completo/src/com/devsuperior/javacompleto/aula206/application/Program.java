package com.devsuperior.javacompleto.aula206.application;

import java.io.File;
import java.util.Scanner;

/**
 * 
 * @author Marlene 
 * SEÇÃO 17: Trabalhando com arquivos 
 * AULA 206. Informações do caminho do arquivo
 */

public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a file path: ");
		String stringPath = scan.nextLine();
		
		File path = new File(stringPath);
		
		//Imprime somente o nome do arquivo
		System.out.println("getName: " + path.getName());
		
		//Imprime o caminho do arquivo
		System.out.println("getParent: " + path.getParent());
		
		//Imprime todo o caminho getName + getParent
		System.out.println("getPath: " + path.getPath());
		
		scan.close();
	}

}
