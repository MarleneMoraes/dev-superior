/*
    Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, 
    inclusive o X, se for o caso.
*/

package com.devsuperior.javacompleto.aula054;

import java.util.Scanner;

public class Ex001 {
	static void ex001() {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("CONTAGEM DE ÍMPARES");
        System.out.print("Digite um valor inteiro: ");
        int x = sc.nextInt();
        
        if (1 <= x && x <= 1000){
            for (int i = 1; i <= x; i+=2){
                System.out.println(i);
            }
        }
        
        sc.close();
   }
}
