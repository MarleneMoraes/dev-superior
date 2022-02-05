/*
    Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
    começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/

package com.devsuperior.javacompleto.aula037;

import java.util.Scanner;

public class Ex004 {
	static void ex004(){
        Scanner sc = new Scanner(System.in);

        System.out.println("DURAÇÃO DO JOGO");
        System.out.print("Digite a hora inicial do jogo: ");
        int horaInicial = sc.nextInt();
        
        System.out.print("Digite a hora final do jogo: ");
        int horaFinal = sc.nextInt();

        int duracaoJogo;
        
        if (horaInicial < horaFinal) {
            duracaoJogo = horaFinal - horaInicial;
        }
        else {
            duracaoJogo = 24 - (horaInicial + horaFinal);
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", duracaoJogo);

        sc.close();
    }
}
