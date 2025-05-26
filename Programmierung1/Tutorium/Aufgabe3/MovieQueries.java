package Aufgabe3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class MovieQueries {

  public static ArrayList<Movie> movies = Movie.getMovies();

  public static List<Movie> a() {
    return movies.stream()
        .filter(m -> m.publishingYear().compareTo("1980") < 0)
        .filter(m -> m.publishingYear().compareTo("1990") >= 0)
        .toList();
  }

  public void b() {

    movies.stream()
        .filter(m -> m.genre().equals(Genre.HORROR))
        .sorted((m1, m2) -> Double.valueOf(m2.rating()).compareTo(m1.rating()))
        .limit(5)
        .map(m -> m.title() + " (" + m.publishingYear() + ")")
        .forEach(System.out::println);
  }

  public boolean c() {
    return movies.stream()
        .anyMatch(m -> m.genre().equals(Genre.THRILLER) && m.rating() >= 5.5 && m.rating() <= 6.5);
  }

  public Map<Genre, List<Movie>> d() {
    return movies.stream().collect(Collectors.groupingBy(m -> m.genre()));
  }

  public OptionalDouble e() {
    OptionalDouble back = null;
    back =
        movies.stream()
            .filter(m -> m.genre().equals(Genre.ACTION))
            .mapToDouble(m -> m.rating())
            .average();
    return back;
  }
}
