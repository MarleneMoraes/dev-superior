package com.devsuperior.javacompleto.aula160;

import java.io.File;
import java.util.Scanner;

/**
 * 
 * @author Marlene 
 * SECAO 15: Trabalhando com arquivos 
 * AULA 160. Informacoes do caminho do arquivo
 */

public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a file path: ");
		String stringPath = scan.nextLine();
		
		File path = new File(stringPath);
		
		// imprime somente o nome do arquivo
		System.out.println("getName: " + path.getName());
		
		// imprime somente o caminho do arquivo
		System.out.println("getParent: " + path.getParent());
		
		// imprime todo o caminho (getName + getParent)
		System.out.println("getPath: " + path.getPath());
		
		scan.close();
	}

}
