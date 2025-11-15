package com.devsuperior.javacompleto.aula125.labs.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	// evita criar copias do SimpleDateFormat para cada instanciacao
	private static SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	List<Comment> comments = new ArrayList<>();
	
	public Post() {	}

	public Post(Date moment, String title, String content, int likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public List<Comment> getComment() {
		return comments;
	}
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		// append = acrescentar no final
		builder.append(getTitle() + "\n");
		builder.append(getLikes() + " Likes - ");
		builder.append(date.format(getMoment()) + "\n");
		builder.append(getContent() + "\n");
		builder.append("Comments:\n");
		
		for (Comment comment : comments) {
			builder.append(comment.getText());
		}
		
		return builder.toString();
	}

}
