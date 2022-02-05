/* 
    Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
    cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
    menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
*/

package com.devsuperior.javacompleto.aula049;

import java.util.Scanner;

public class Ex002 {
	 static void ex002() {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("QUADRANTE DO SISTEMA CARTESIANO");
	        System.out.print("Digite a coordenada X: ");
	        byte eixoX = sc.nextByte();

	        System.out.print("Digite a coordenada Y: ");
	        byte eixoY = sc.nextByte();

	        while (eixoX != 0 && eixoY != 0) {
	            if (eixoX > 0 && eixoY > 0) {
	                System.out.println("primeiro");
	            } else if (eixoX < 0 && eixoY > 0) {
	                System.out.println("segundo");
	            } else if (eixoX < 0 && eixoY < 0) {
	                System.out.println("terceiro");
	            } else {
	                System.out.println("quarto");
	            }

	            System.out.print("Digite a coordenada X: ");
	            eixoX = sc.nextByte();

	            System.out.print("Digite a coordenada Y: ");
	            eixoY = sc.nextByte();
	        }

	         sc.close();
	    }
}
