package com.devsuperior.javacompleto.aula100;

import java.util.Scanner;

/**
 * @author Marlene 
 * SEÇÃO 10: Comportamento de Mem�ria, arrays, listas 
 * AULA 100. Exerc�cio proposto
 */

/*
 * Fazer um programa para ler dois n�meros inteiros M e N, e depois ler
 * uma matriz de M linhas por N colunas contendo n�meros inteiros,
 * podendo haver repeti��es. Em seguida, ler um n�mero inteiro X que
 * pertence � matriz. Para cada ocorr�ncia de X, mostrar os valores �
 * esquerda, acima, � direita e abaixo de X, quando houver.
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
		
		for(int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if(X == matriz[i][j]) {
					System.out.println("--------------------");
					System.out.printf("Position %d, %d", i,j);
					
					if(i >= 0 && i < M) {
						
					}
				}
			}
		}
		
		scan.close();
	}

}
