package com.devsuperior.javacompleto.aula188.labs.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.devsuperior.javacompleto.aula188.labs.entities.User;

/**
 * 
 * @author Marlene 
 * SECAO 17: Generics, Set, Map 
 * AULA 188. Exercicio de fixacao (Set)
 */

public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Set<User> users = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		users = addingUserOnSet(scan, users);
		
		System.out.print("How many students for course B? ");
		users = addingUserOnSet(scan, users);
		
		System.out.print("How many students for course C? ");
		users = addingUserOnSet(scan, users);
		
		System.out.println("Total students: " + users.size());
		scan.close();
	}

	private static Set<User> addingUserOnSet(Scanner scan, Set<User> users) {
		int n = scan.nextInt();
		int code;
		
		for(int i = 0; i < n; i++) {
			code = scan.nextInt();
			users.add(new User(code));
		}
		
		return users;
	}

}
