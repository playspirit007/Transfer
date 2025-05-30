package Messdaten;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public record MeasurementData(
    String country, LocalDate date, double temperatureInC, int percentage, char category) {

  private static final int NUMBER_OF_ENTRIES = 100;
  private static final int MAX_DAYS = 2000;
  private static final int MAX_TEMPERATURE_IN_CELCIUS = 40;
  private static final int MAX_PERCENTAGE = 101;
  private static final List<String> COUNTRIES =
      List.of("USA", "Brasilien", "Deutschland", "Japan", "Indien");
  private static final List<Character> CATEGORIES = List.of('D', 'X', 'F');

  public static List<MeasurementData> getMeasurementData() {
    List<MeasurementData> measurementData = new ArrayList<>();

    Random rnd = new Random();
    LocalDate now = LocalDate.now();

    for (int i = 0; i < NUMBER_OF_ENTRIES; i++) {
      LocalDate date = now.minusDays(rnd.nextInt(MAX_DAYS));
      double temperatureInC = rnd.nextDouble(MAX_TEMPERATURE_IN_CELCIUS);
      int percentage = rnd.nextInt(MAX_PERCENTAGE);
      String country = COUNTRIES.get(rnd.nextInt(COUNTRIES.size()));
      char category = CATEGORIES.get(rnd.nextInt(CATEGORIES.size()));
      measurementData.add(new MeasurementData(country, date, temperatureInC, percentage, category));
    }

    return measurementData;
  }
}
