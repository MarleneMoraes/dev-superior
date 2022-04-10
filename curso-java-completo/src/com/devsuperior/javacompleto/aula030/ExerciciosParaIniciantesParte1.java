package com.devsuperior.javacompleto.aula030;

/**
 * 
 * @author Marlene
 * SEÇÃO 4: Estrutura sequencial
 * AULA 30. Exercícios para Iniciantes - PARTE 1
 */

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosParaIniciantesParte1 {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
	        Scanner scanner = new Scanner(System.in);
	        
	        int ex;
	        
	        System.out.println("EXERCÍCIOS SEQUENCIAIS DEVSUPERIOR JAVA");
	        
	        do{
	            System.out.print("Digite o número do exercício (1-6) ou 0 para sair: ");
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
	                default:
	                   System.out.println("ERRO. TENTE NOVAMENTE."); 
	            }
	            
	        } while (ex != 0);
	        
	       scanner.close();

	}

}
