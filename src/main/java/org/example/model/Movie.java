package org.example.model;

public class Movie {

	private final String title;
	private final int year;
	private final String author;

	public Movie(String title, int year, String author){
		this.title = title;
		this.year = year;
		this.author = author;
	}

	public String getTitle(){
		return this.title;
	}

	public int getYear(){
		return this.year;
	}

	public String getAuthor(){
		return this.author;
	}

}
