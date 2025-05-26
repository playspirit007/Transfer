package Aufgabe4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataQueries {

  private static ArrayList<Data> data = Data.getData();

  public static ArrayList<Data> getData() {
    return data;
  }

  public static void setData(ArrayList<Data> data) {
    DataQueries.data = data;
  }

  public static List<Data> a() {
    return data.stream()
        .filter(d -> d.shapeType().equals(ShapeType.RECTANGLE))
        .sorted((m1, m2) -> Integer.valueOf(m2.percentage()).compareTo(m1.percentage()))
        .toList();
  }

  public static int b() {
    return data.stream()
        .filter(d -> d.temperature() >= 20.0)
        .mapToInt(d -> d.shapeType().getCorner())
        .sum();
  }

  public static void c() {
    data.stream()
        .filter(d -> d.percentage() >= 50)
        .filter(
            d ->
                d.date().getMonthValue() == 12
                    || d.date().getMonthValue() == 1
                    || d.date().getMonthValue() == 2)
        .map(d -> d.country() + " " + d.date().getYear() + " : " + d.percentage())
        .forEach(System.out::println);
  }

  public static Data d() {
    return data.stream()
        .filter(d -> (d.temperature() * d.percentage()) / 100 > 10)
        .findAny()
        .orElse(null);
  }

  public static boolean e() {
    return data.stream()
        .anyMatch(d -> d.country().equals("China") && d.date().equals(LocalDate.now()));
  }
}
