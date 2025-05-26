package Aufgabe4;

import java.time.LocalDate;
import java.util.ArrayList;

public record Data(
    String country, LocalDate date, double temperature, int percentage, ShapeType shapeType) {

  public static ArrayList<Data> getData() {
    ArrayList<Data> data = new ArrayList<>();
    return data;
  }
}
