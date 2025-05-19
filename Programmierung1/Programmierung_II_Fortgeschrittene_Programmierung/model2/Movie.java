package model2;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * Movie
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Movie implements Comparable<Movie> {

	private final String title;
	private final List<model2.Genre> genres;
	private final String year;
	private final int runtimeInMinutes;
	private final double rating;
	private final int votes;

	public Movie(String title, List<model2.Genre> list, String year, int runtimeInMinutes, double rating, int votes)
			throws InvalidValueException {
		if (rating < 0 || rating > 10) {
			throw new InvalidValueException("rating", rating);
		}
		if (runtimeInMinutes <= 0) {
			throw new InvalidValueException("runtimeInMinutes", runtimeInMinutes);
		}
		if (votes < 0) {
			throw new InvalidValueException("votes", votes);
		}

		this.title = title;
		this.genres = list;
		this.year = year;
		this.runtimeInMinutes = runtimeInMinutes;
		this.rating = rating;
		this.votes = votes;
	}

	public String getTitle() {
		return title;
	}

	public List<model2.Genre> getGenres() {
		return genres;
	}

	public String getYear() {
		return year;
	}

	public int getRuntimeInMinutes() {
		return runtimeInMinutes;
	}

	public double getRating() {
		return rating;
	}

	public int getVotes() {
		return votes;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", genres=" + genres + ", year=" + year + ", runtimeInMinutes="
				+ runtimeInMinutes + ", rating=" + rating + ", votes=" + votes + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(genres, rating, runtimeInMinutes, title, votes, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Movie other = (Movie) obj;
		return Objects.equals(genres, other.genres)
				&& Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating)
				&& runtimeInMinutes == other.runtimeInMinutes && Objects.equals(title, other.title)
				&& votes == other.votes && Objects.equals(year, other.year);
	}

	@Override
	public int compareTo(Movie otherMovie) {
		return title.compareTo(otherMovie.title);
	}

	/**
	 * MovieByRatingDescendingComparator
	 *
	 * @author Daniel Appenmaier
	 * @version 1.0
	 *
	 */
	public static class MovieByRatingDescendingComparator implements Comparator<Movie> {

		@Override
		public int compare(Movie movie1, Movie movie2) {
			/* Option A */
			// double rating1 = movie1.getRating();
			// double rating2 = movie2.getRating();
			// if (rating1 < rating2 ) {
			// return -1;
			// } else if (rating1 > rating2) {
			// return 1;
			// } else {
			// return 0;
			// }

			/* Option B */
			// return Double.compare(movie2.getRating(), movie1.getRating());

			/* Option C */
			Double rating1 = movie1.getRating();
			Double rating2 = movie2.getRating();
			return rating2.compareTo(rating1);
		}

	}

	/**
	 * Genre
	 *
	 * @author Daniel Appenmaier
	 * @version 1.0
	 *
	 */
	public static enum Genre {

		ACTION("Action"), ADVENTURE("Adventure"), ANIMATION("Animation"), BIOGRAPHY("Biography"), COMEDY("Comedy"),
		CRIME("Crime"), DOCUMENTARY("Documentary"), DRAMA("Drama"), FAMILY("Family"), FANTASY("Fantasy"),
		FILM_NOIR("Film Noir"), HISTORY("History"), HORROR("Horror"), MUSIC("Music"), MUSICAL("Musical"),
		MYSTERY("Mystery"), NEWS("News"), ROMANCE("Romance"), SCIENCE_FICTION("Science Fiction"), SPORT("Sport"),
		THRILLER("Thriller"), WAR("War"), WESTERN("Western");

		private final String description;

		Genre(String description) {
			this.description = description;
		}

		public String getDescription() {
			return description;
		}

	}

}
