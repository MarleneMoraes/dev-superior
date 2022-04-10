/*
    Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. 
    Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 
    2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser 
    solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for 
    o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada 
    tipo de combustível.
 */

package com.devsuperior.javacompleto.aula049;

/**
 * 
 * @author Marlene
 * SEÇÃO 6: Estruturas repetitivas
 * AULA 49. Exercícios para iniciantes - PARTE 3
 */

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosParaIniciantesParte3 {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
	     Scanner scanner = new Scanner(System.in);
	        
	        int ex = -1;
	        
	        System.out.println("EXERCÍCIOS DE REPETIÇÃO WHILE DEVSUPERIOR JAVA");
	        
	       while (ex != 0){
	            System.out.print("Digite o número do exercício (1-3) ou 0 para sair: ");
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
