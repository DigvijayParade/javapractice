package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MovieAnalyze {

	public static void main(String[] args) {

		MovieAnalyze obj = new MovieAnalyze();
		ArrayList<MovieData> movieList = obj.getMovieData();

		Predicate<MovieData> highRating = m -> m.getRating() >= 8.5;

		movieList.stream()
				 .filter(highRating)
				 .map(m -> m.getTitle())
				 .forEach(title -> System.out.println(title));

		movieList.stream()
				 .filter(m -> m.getReleaseYear() > 2015)
				 .forEach(m -> System.out.println(m.getTitle() + " - " + m.getRating()));
	}

	public ArrayList<MovieData> getMovieData() {
		return new ArrayList<>(List.of(
			new MovieData("Inception", "Christopher Nolan", 8.8, 2010),
			new MovieData("Interstellar", "Christopher Nolan", 8.7, 2014),
			new MovieData("Parasite", "Bong Joon-ho", 8.5, 2019),
			new MovieData("Dune", "Denis Villeneuve", 8.0, 2021),
			new MovieData("Oppenheimer", "Christopher Nolan", 8.9, 2023),
			new MovieData("The Matrix", "Wachowskis", 8.7, 1999)
		));
	}
}