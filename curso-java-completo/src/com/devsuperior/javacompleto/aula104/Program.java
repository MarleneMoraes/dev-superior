package com.devsuperior.javacompleto.aula104;

import java.util.Scanner;

/**
 * @author Marlene 
 * SEÇÃO 10: Comportamento de Memoria, arrays, listas 
 * AULA 104. Exercicio proposto
 * 
 */

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Quantidade de linhas: ");
		int M = scan.nextInt();

		System.out.println("Quantidade de colunas: ");
		int N = scan.nextInt();

		int[][] matriz = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matriz[i][j] = scan.nextInt();
			}
		}

		System.out.print("Valor : ");
		int X = scan.nextInt();

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (X == matriz[i][j]) {
					System.out.println("--------------------");
					System.out.printf("Position %d, %d", i, j);

					if (i >= 0 && i < M) {

					}
				}
			}
		}

		scan.close();
	}

}
