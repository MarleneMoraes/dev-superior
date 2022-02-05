package com.devsuperior.javacompleto.aula059;

public class Main {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase(); //transforma em letras minúsculas
		String s02 = original.toUpperCase(); //transforma em letras maiúsculas
		String s03 = original.trim(); //suprime espaços
		String s04 = original.substring(2); //imprime a partir do index 2
		String s05 = original.substring(2, 9); //imprime do index 2 ao 9
		String s06 = original.replace('a', 'x'); // substitui os caracteres a por x 
		String s07 = original.replace("abc", "xy"); // substitui as strings abc por xy 
		int i = original.indexOf("bc"); //número de vezes que o index que a string aparece
		int j = original.lastIndexOf("bc"); //último index que a string aparece
		
		System.out.printf("Original: -%s-%n", original);
		System.out.printf("toLowerCase: -%s-%n", s01); 
		System.out.printf("toUpperCase: -%s-%n", s02); 
		System.out.printf("trim: -%s-%n", s03);
		System.out.printf("substring(2): -%s-%n", s04);
		System.out.printf("substring(2,9): -%s-%n", s05);
		System.out.printf("replace('a', 'x'): -%s-%n", s06);
		System.out.printf("replace('a', 'x'): -%s-%n", s07);
		System.out.printf("Index of 'bc': %d%n", i);
		System.out.printf("Last index of 'bc': %d%n", j);
		

		//OPERAÇÃO SPLIT
		String s = "potato apple lemon";
		
		String[] vect = s.split(" "); //reparte as strings na index
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
	}

}
