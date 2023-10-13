package org.example;

import com.google.gson.Gson;
import org.example.model.Movie;
import org.example.model.Session;
import org.example.model.Theatre;

import java.io.FileWriter;
import java.io.IOException;

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

			Gson gson = new Gson();
			String movie1Json = gson.toJson(movie1);
			String movie2Json = gson.toJson(movie2);
			String theater1Json = gson.toJson(theatre1);
			String theater2Json = gson.toJson(theatre2);
			String session1Json = gson.toJson(session1);
			String session2Json = gson.toJson(session2);

			try {
				FileWriter movie1Writer = new FileWriter("movie1.json");
				FileWriter movie2Writer = new FileWriter("movie2.json");
				FileWriter theater1Writer = new FileWriter("theater1.json");
				FileWriter theater2Writer = new FileWriter("theater2.json");
				FileWriter session1Writer = new FileWriter("session1.json");
				FileWriter session2Writer = new FileWriter("session2.json");

				movie1Writer.write(movie1Json);
				movie2Writer.write(movie2Json);
				theater1Writer.write(theater1Json);
				theater2Writer.write(theater2Json);
				session1Writer.write(session1Json);
				session2Writer.write(session2Json);

				movie1Writer.close();
				movie2Writer.close();
				theater1Writer.close();
				theater2Writer.close();
				session1Writer.close();
				session2Writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
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