package Wetterstation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ValueHelper {

  public static void main(String[] agrs) throws FileNotFoundException {

    File file = new File("Repetorium/Wetterstation/MesswertDatei.txt");
    Scanner myScanner = new Scanner(file);

    WeatherStation wheatherStation = new WeatherStation("Dach");

    while (myScanner.hasNextLine()) {
      String line = myScanner.nextLine();
      String[] input = line.split(";");
      long timestamp = Long.parseLong(input[0]);
      double value = Double.parseDouble(input[1]);
      Sensor sensor;
      if (input[2].contains("TEMPERATURE")) {
        sensor = Sensor.TEMPERATURE;
      } else if (input[2].contains("HUMIDITY")) {
        sensor = Sensor.HUMIDITY;
      } else if (input[2].contains("PRECIPITATION")) {
        sensor = Sensor.PRECIPITATION;
      } else {
        sensor = Sensor.AIRPRESSURE;
      }
      MeasurementValue measurementValue = new MeasurementValue(timestamp, value, sensor);
      wheatherStation.addMeasurementValue(measurementValue);
    }
    long end = 999999999;
    System.out.println(
        "Durchschnitt: " + wheatherStation.getAverageValueBySensor(Sensor.TEMPERATURE, 0, end));
  }
}
