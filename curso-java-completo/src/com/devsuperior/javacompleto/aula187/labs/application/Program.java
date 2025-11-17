package com.devsuperior.javacompleto.aula187.labs.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.devsuperior.javacompleto.aula187.labs.entities.LogEntry;

/**
 * 
 * @author Marlene 
 * SECAO 17: Generics, Set, Map 
 * AULA 187. Exercicio resolvido (Set)
 */

public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre file full path");
		String path = scan.nextLine();
		
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
			Set<LogEntry> users = new HashSet<>();
			
			String line = bufferedReader.readLine();
			while(line != null) {
				String[] fields = line.split("");
				
				users.add(new LogEntry(fields[0], Date.from(Instant.parse(fields[1]))));
				
				line = bufferedReader.readLine();
			}
			
			System.out.println("Total users: " + users.size());
		} catch(IOException e) {
			System.out.println("ERROR");
			System.out.println(e.getMessage());
		}
		
		scan.close();
	}

}
