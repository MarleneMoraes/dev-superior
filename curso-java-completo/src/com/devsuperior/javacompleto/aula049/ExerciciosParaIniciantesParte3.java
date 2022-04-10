/*
    Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. 
    Escreva um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 
    2.Gasolina 3.Diesel 4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser 
    solicitado um novo c�digo (at� que seja v�lido). O programa ser� encerrado quando o c�digo informado for 
    o n�mero 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada 
    tipo de combust�vel.
 */

package com.devsuperior.javacompleto.aula049;

/**
 * 
 * @author Marlene
 * SE��O 6: Estruturas repetitivas
 * AULA 49. Exerc�cios para iniciantes - PARTE 3
 */

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosParaIniciantesParte3 {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
	     Scanner scanner = new Scanner(System.in);
	        
	        int ex = -1;
	        
	        System.out.println("EXERC�CIOS DE REPETI��O WHILE DEVSUPERIOR JAVA");
	        
	       while (ex != 0){
	            System.out.print("Digite o n�mero do exerc�cio (1-3) ou 0 para sair: ");
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
	                default:
	                   System.out.println("ERRO. TENTE NOVAMENTE."); 
	            }
	            
	        }
	        
	       scanner.close();

	}

}
