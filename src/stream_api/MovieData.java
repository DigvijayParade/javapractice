package stream_api;

import java.util.Objects;

public class MovieData {

	private String title;
	private String director;
	private double rating;
	private int releaseYear;

	public MovieData() {}

	public MovieData(String title, String director, double rating, int releaseYear) {
		this.title = title;
		this.director = director;
		this.rating = rating;
		this.releaseYear = releaseYear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Override
	public int hashCode() {
		return Objects.hash(director, rating, releaseYear, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieData other = (MovieData) obj;
		return Objects.equals(director, other.director)
				&& Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating)
				&& releaseYear == other.releaseYear && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "MovieData [title=" + title + ", director=" + director + ", rating=" + rating + ", releaseYear="
				+ releaseYear + "]";
	}
}