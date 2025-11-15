package com.devsuperior.javacompleto.aula125.labs.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.devsuperior.javacompleto.aula125.labs.entities.Comment;
import com.devsuperior.javacompleto.aula125.labs.entities.Post;

/**
 * 
 * @author Marlene 
 * SECAO 12: Enumeracoes, composicao
 * AULA 125. Exercicio resolvido 2 (demo StringBuilder)
 */


public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment comment1 = new Comment("Have a nice trip!");
		Comment comment2 = new Comment("Wow that's awesome!");
		
		Post post1 = new Post(
						date.parse("21/06/2018 13:05:44"),
						"Traveling to New Zealand", 
						"I'm going to visit this wonderful country!", 
						12);
		post1.addComment(comment1);
		post1.addComment(comment2);
		
		
		Comment comment3 = new Comment("Good Night");
		Comment comment4 = new Comment("May the Force be with you");
		
		Post post2 = new Post(
						date.parse("28/07/2018 23:14:19"),
						"Good night guys", 
						"See you tomorrow", 
						5);
		post2.addComment(comment3);
		post2.addComment(comment4);
		
		System.out.println(post1.toString() + "\n");
		System.out.println(post2.toString());
		
	}

}
