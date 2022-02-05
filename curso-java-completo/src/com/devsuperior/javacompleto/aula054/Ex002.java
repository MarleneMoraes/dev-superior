/*
    Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
    Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
    essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)
 */

package com.devsuperior.javacompleto.aula054;

import java.util.Scanner;

public class Ex002 {
	static void ex002() {
        Scanner sc = new Scanner(System.in);

        System.out.println("IN OR OUT");
        System.out.print("Digite a quantidade de valores lidos: ");
        int n = sc.nextInt();

        int in = 0, out = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor X: ");
            int x = sc.nextInt();
            
            if (x >= 10 && x <= 20) {
                in++;
            }
            else {
                out++;
            }
        }

        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out);

        sc.close();
	}
}
