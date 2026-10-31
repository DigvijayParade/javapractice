package stream_api;

import java.util.List;

public class MovieApp {

	public static void main(String[] args) {
		
		List<Movie> mL = List.of(
						
					new Movie(101, "Interstellar", "Sci-Fi", 8.6, 2014, true),
					new Movie(102, "Spider-Man: Into the Spider-Verse", "Animation", 8.4, 2018, true),
					new Movie(103, "The Dark Knight", "Action", 9.0, 2008, false),
					new Movie(104, "Dune", "Sci-Fi", 8.0, 2021, true),
					new Movie(105, "Tenet", "Sci-Fi", 7.3, 2020, true),
					new Movie(106, "Everything Everywhere All at Once", "Sci-Fi", 8.8, 2022, false)
				);
		
		List<String> some = mL.stream()
								.filter(m -> m.getReleaseYear() > 2015)
								.filter(m -> m.getRating() > 8.0)
								.filter(m -> m.isStreaming())
								.map(m -> m.getTitle())//or else .map(Movie::getTitle)
								.toList();
		
		System.out.println(some);
	}
}
