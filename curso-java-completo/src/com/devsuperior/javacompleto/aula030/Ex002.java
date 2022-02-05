/*
    Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
    Fórmula da área: area = π . raio²
    Considere o valor de π = 3.14159
 */

package com.devsuperior.javacompleto.aula030;

import java.util.Scanner;

public class Ex002 {
	 static void ex002() {
	        Scanner scanner = new Scanner(System.in);      
	                
	        System.out.println("ÁREA DO CÍRCULO");
	        
	        System.out.println("Digite o valor do raio: ");
	        float raio = scanner.nextFloat();
	        
	        double area = areaCirculo(raio);
	        
	        System.out.printf("A = %.4f\n", area);
	        
	        scanner.close();
	    }
	    
	    static double areaCirculo(float r){
	        return 3.14159*(Math.pow(r,2));
	    }
}
