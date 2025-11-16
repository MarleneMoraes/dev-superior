package com.devsuperior.javacompleto.aula155;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Marlene
 * SECAO 15: Trabalhando com arquivos
 * AULA 155. Lendo arquivo texto com classes File e Scanner
 */

public class Program {
	public static void main(String[] args) { 
		//Objeto que encapsula as operacoes do file
		File file = new File("c:\\temp\\in.txt"); // a barra e um caractere especial e precisa estar duplo para ser lido
		
		//nstanciar o Scanner a partir do file
		Scanner sc = null;
		
		// tentativa de abrir o arquivo pode gerar uma excecao do tipo IOException
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
				sc.close(); // fechamento do rescurso independente de disparar excecoes boas praticas
			}
		}
		
	}

}
