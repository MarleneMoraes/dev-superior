/*
    Com base na tabela abaixo, escreva um programa que leia o c�digo de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

    CODIGO          ESPECIFICA��O           PRE�O
      1             Cachorro Quente         R$4.00
      2             X-Salada                R$4.50
      3             X-Bacon                 R$5.00
      4             Torrada Simples         R$2.00
      5             Refrigerante            R$1.50
*/

package com.devsuperior.javacompleto.aula037;

import java.util.Scanner;

public class Ex005 {
	static void ex005(){
        Scanner sc = new Scanner(System.in);

        System.out.println("CAIXA DA LANCHONETE");
        System.out.print("C�digo do item: ");
        byte codigo = sc.nextByte();
        
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        float total = 0;
        
        switch (codigo){
            case 1:
                total += (quantidade * 4.00);
                break;
            case 2:
                total += (quantidade * 4.50);
                break;
            case 3: 
                total += (quantidade * 5.00);
                break;    
            case 4: 
                total += (quantidade * 2.00);
                break;
            case 5: 
                total += (quantidade * 1.50);
                break;
            default:
                System.out.println("C�DIGO INV�LIDO. TENTE NOVAMENTE."); 
        }

        System.out.printf("Total: R$%.2f\n", total);

        sc.close();
    }
}
