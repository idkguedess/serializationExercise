package org.example.model;

public class Session {
	public Movie movie;
	public Theatre theatre;
	private final String date;

	public Session(Movie movie, Theatre theatre, String date) {
		this.movie = movie;
		this.theatre = theatre;
		this.date = date;
	}

	public Movie getMovie() {
		return this.movie;
	}

	public Theatre getTheatre() {
		return this.theatre;
	}

	public String getDate() {
		return this.date;
	}
}
