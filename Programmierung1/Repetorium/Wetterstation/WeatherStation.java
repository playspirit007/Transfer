package Wetterstation;

import java.util.ArrayList;

public class WeatherStation {

  private final int id;
  private final String location;
  private final ArrayList<MeasurementValue> measurementValues;
  private static int counter;

  public WeatherStation(String location) {
    this.id = counter + 1;
    this.location = location;
    measurementValues = new ArrayList<>();
    counter++;
  }

  public void addMeasurementValue(MeasurementValue measurementValue) {
    measurementValues.add(measurementValue);
  }

  public double getAverageValueBySensor(Sensor sensor, long start, long end) {
    double average = 0;
    int counter = 0;
    for (MeasurementValue measurementValue : measurementValues) {
      if (measurementValue.getTimestamp() > start
          && measurementValue.getTimestamp() < end
          && measurementValue.getSensor() == sensor) {
        average = average + measurementValue.getValue();
        counter++;
      }
    }
    average = average / counter;
    return average;
  }
}
