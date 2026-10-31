package stream_api;

public class Movie {
	
	private int id ;

	private String title ;

	private String genre ;
 
	private double rating ;

	private int releaseYear ;

	private boolean isStreaming ;
	
	public Movie() {}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", genre=" + genre + ", rating=" + rating + ", releaseYear="
				+ releaseYear + ", isStreaming=" + isStreaming + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
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

	public boolean isStreaming() {
		return isStreaming;
	}

	public void setStreaming(boolean isStreaming) {
		this.isStreaming = isStreaming;
	}
}
