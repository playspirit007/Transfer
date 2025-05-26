package Aufgabe3;

import java.util.ArrayList;

public record Movie(String title, Genre genre, String publishingYear, double rating) {

  public static ArrayList<Movie> getMovies() {
    ArrayList<Movie> Back = new ArrayList<>();
    return Back;
  }
}
