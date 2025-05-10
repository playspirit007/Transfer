package Videosammlung;

public abstract class Video {
	
	private final Movie movie;
	
	public Video(Movie movie) {
		this.movie = movie;
	}

	public Movie getMovie() {
		return movie;
	}
}
