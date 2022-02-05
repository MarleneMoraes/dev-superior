/*
    Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. 
    Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 
    2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser 
    solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for 
    o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada 
    tipo de combustível.
 */

package com.devsuperior.javacompleto.aula049;

import java.util.Scanner;

public class Ex003 {
	 static void ex003(){
	        Scanner sc = new Scanner (System.in);
	        byte combustivel = 0;
	        int alcool = 0, gasolina = 0, diesel = 0; 
	         
	        while (combustivel != 4){
	            System.out.println("PESQUISA DE COMBUSTÍVEIS");
	            System.out.print("Digite o combustível de sua preferência ");
	            System.out.print("(1.Álcool 2.Gasolina 3.Diesel 4.Fim): ");
	            
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
