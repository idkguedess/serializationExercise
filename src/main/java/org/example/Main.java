package org.example;

import org.example.model.Movie;
import org.example.model.Session;
import org.example.model.Theatre;

public class SerializationExercises {
	/*
		Should define the class for the concepts Movie, Theater and Session.
		A session is a play of movie in a theater.
		Create 2 instances of each class and relate among them.
		Serialize to Json all objects and save then in different files.
	 */

	public static class Exercise1 {
		public static void main(String[] args) {
			Movie movie1 = new Movie("Movie 1", 1997, "Author 1");
			Movie movie2 = new Movie("Movie 2", 2001, "Author 2");

			Theatre theatre1 = new Theatre("Theatre 1");
			Theatre theatre2 = new Theatre("Theatre 2");

			Session session1 = new Session(movie1, theatre1, "10/07/21");
			Session session2 = new Session(movie2, theatre2, "15/12/23");
		}
	}

	/*
		Deserialize the objects created in exercise 1.
		Now serialize them using ObjectOutputStream
	 */
	public static class Exercise2 {

		public static void main(String[] args) {

		}
	}

	/*
	   Deserialize the objects from the binary files created in exercise 2.
	*/
	public static class Exercise3 {

		public static void main(String[] args) {

		}
	}
}