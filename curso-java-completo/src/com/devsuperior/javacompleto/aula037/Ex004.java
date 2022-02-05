/*
    Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode
    come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.
*/

package com.devsuperior.javacompleto.aula037;

import java.util.Scanner;

public class Ex004 {
	static void ex004(){
        Scanner sc = new Scanner(System.in);

        System.out.println("DURA��O DO JOGO");
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
