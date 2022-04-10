package com.devsuperior.javacompleto.aula054;

/**
 * 
 * @author Marlene
 * SE��O 6: Estruturas repetitivas
 * AULA 54. Exerc�cios para iniciantes - PARTE 4
 */

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosParaIniciantesParte4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        int ex = -1;
        
        System.out.println("EXERC�CIOS DE REPETI��O FOR DEVSUPERIOR JAVA");
        
        while (ex != 0){
            System.out.print("Digite o n�mero do exerc�cio (1-7) ou 0 para sair: ");
            ex = scanner.nextInt();
            
            switch (ex){
                case 0:
                    break;
                case 1:
                    Ex001.ex001();
                    break;
                case 2:
                    Ex002.ex002();
                    break;
                case 3:
                    Ex003.ex003();
                    break;
                case 4:
                    Ex004.ex004();
                    break;
                case 5:
                    Ex005.ex005();
                    break;
                case 6:
                    Ex006.ex006();
                    break;
                case 7:
                    Ex007.ex007();
                default:
                   System.out.println("ERRO. TENTE NOVAMENTE."); 
            }
            
        }
        
       scanner.close();

	}

}
