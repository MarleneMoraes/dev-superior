/*
    Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. 
    Escreva um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 
    2.Gasolina 3.Diesel 4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser 
    solicitado um novo c�digo (at� que seja v�lido). O programa ser� encerrado quando o c�digo informado for 
    o n�mero 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada 
    tipo de combust�vel.
 */

package com.devsuperior.javacompleto.aula049;

import java.util.Scanner;

public class Ex003 {
	 static void ex003(){
	        Scanner sc = new Scanner (System.in);
	        byte combustivel = 0;
	        int alcool = 0, gasolina = 0, diesel = 0; 
	         
	        while (combustivel != 4){
	            System.out.println("PESQUISA DE COMBUST�VEIS");
	            System.out.print("Digite o combust�vel de sua prefer�ncia ");
	            System.out.print("(1.�lcool 2.Gasolina 3.Diesel 4.Fim): ");
	            
	            combustivel = sc.nextByte();
	            
	            switch (combustivel){
	                case 1:
	                    alcool++;
	                    break;
	                case 2:
	                    gasolina++;
	                    break;
	                case 3:
	                    diesel++;
	                    break;
	                case 4:
	                    System.out.println("MUITO OBRIGADO");
	                    System.out.printf("Alcool: %d\n", alcool);
	                    System.out.printf("Gasolina: %d\n", gasolina);
	                    System.out.printf("Diesel: %d\n", diesel);
	                    break;
	                default:
	                   System.out.println("ERRO. TENTE NOVAMENTE."); 
	            }    
	        }
	        
	        sc.close();
	    }
}
