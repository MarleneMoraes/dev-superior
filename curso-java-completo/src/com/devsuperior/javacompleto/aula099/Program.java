package com.devsuperior.javacompleto.aula099;

import java.util.Scanner;

/**
 * @author Marlene 
 * SE��O 10: Comportamento de Mem�ria, arrays, listas 
 * AULA 99. Exerc�cio resolvido
 */

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] matriz = new int[n][n]; 
		int count = 0;
		
		for (int i=0; i<n; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = scan.nextInt();
				
				if(matriz[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Main diagonal: ");
		for(int i = 0; i < n; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		System.out.println();
		System.out.println("Negative numbers: " + count);
		
		
		scan.close();
	}

}
