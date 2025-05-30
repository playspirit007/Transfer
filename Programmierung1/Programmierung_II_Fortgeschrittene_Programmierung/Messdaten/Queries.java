package Messdaten;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public record Queries(List<MeasurementData> measurementData) {

  public List<MeasurementData> a(LocalDate year) {
    List<MeasurementData> back = new ArrayList<>();
    back =
        measurementData.stream()
            .filter(m -> m.date().getYear() == year.getYear())
            .filter(m -> m.category() == 'F')
            .sorted((m1, m2) -> Integer.valueOf(m2.percentage()).compareTo(m1.percentage()))
            .toList();
    return back;
  }

  public OptionalDouble b() {
    OptionalDouble back = null;
    back =
        measurementData.stream()
            .filter(m -> m.category() == 'X')
            .mapToDouble(m -> m.percentage())
            .average();
    return back;
  }

  public List<MeasurementData> c() {
    List<MeasurementData> back = new ArrayList<>();
    back =
        measurementData.stream()
            .filter(m -> m.temperatureInC() >= 30.0)
            .filter(
                m ->
                    m.date().getMonthValue() == 6
                        || m.date().getMonthValue() == 7
                        || m.date().getMonthValue() == 8)
            .toList();
    return back;
  }

  public boolean d() {
    return measurementData.stream()
        .anyMatch(
            m ->
                m.country().contains("Deutschland")
                    && m.date().getDayOfMonth() == 1
                    && m.date().getMonthValue() == 1
                    && m.percentage() >= 50);
  }

  public void e() {
    measurementData.stream()
        .collect(Collectors.groupingBy(m -> m.country()))
        .forEach(
            (c, mList) -> {
              double avg =
                  mList.stream()
                      .mapToDouble(x -> Double.valueOf(x.temperatureInC()))
                      .average()
                      .orElse(Double.NaN); // Falls keine Daten vorhanden sind
              System.out.println(c + ": " + avg);
            });
  }
}
