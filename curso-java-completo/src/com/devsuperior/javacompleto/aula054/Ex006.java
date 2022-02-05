/*
    Ler um número inteiro N e calcular todos os seus divisores.
 */
package com.devsuperior.javacompleto.aula054;

import java.util.Scanner;

public class Ex006 {
	static void ex006() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
   } 
}
