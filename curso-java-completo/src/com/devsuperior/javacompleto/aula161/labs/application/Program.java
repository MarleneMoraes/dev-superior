package com.devsuperior.javacompleto.aula161.labs.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.javacompleto.aula161.labs.model.entities.Product;

/**
 * 
 * @author Marlene 
 * SECAO 15: Trabalhando com arquivos 
 * AULA 161. Exercicio proposto
 */

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter file path: ");
		String sourceFilePath = scan.nextLine();
		scan.close();
		
		List<Product> products = new ArrayList<>();
		
		File sourceFile = new File(sourceFilePath);
		String sourceFolder = sourceFile.getParent();
		
		boolean isDirectoryCreated = new File(sourceFolder + "\\out").mkdir();
		
		String targetFile = sourceFolder + "\\out\\summary.csv";
		
		try (BufferedReader buffReader = new BufferedReader(new FileReader(sourceFilePath))){
			String line = buffReader.readLine();
			
			while (line != null) {
				String[] data = line.split(",");
				
				products.add(new Product(data[0], Double.parseDouble(data[1]), Integer.parseInt(data[2])));
				
				line = buffReader.readLine();
			}
			
			try (BufferedWriter buffWriter = new BufferedWriter(new FileWriter(targetFile, true))) {
				for(Product product : products) {
					buffWriter.write(product.toString());
					buffWriter.newLine();
				}
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
	}
}
