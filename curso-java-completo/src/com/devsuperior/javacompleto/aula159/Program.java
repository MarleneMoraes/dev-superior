package com.devsuperior.javacompleto.aula159;

import java.io.File;
import java.util.Scanner;

/**
 * 
 * @author Marlene 
 * SECAO 15: Trabalhando com arquivos 
 * AULA 159. Manipulando pastas com File
 */

public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String stringPath = scan.nextLine();

		File path = new File(stringPath);
		
		// listar apenas as pastas
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders: ");
		for (File folder : folders) {
			System.out.println(folder);
		}

		// listar apenas arquivos
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files: ");

		for (File file : files) {
			System.out.println(file);
		}
	
		// criar uma subpasta da pasta temp
		boolean success = new File(stringPath + "\\subdir").mkdir(); 
		System.out.println("Directory created successfully: " + success);
		
		scan.close();
	}
}