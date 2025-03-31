package Wetterstation;

public enum Sensor {
  TEMPERATURE("Temperatur", "°C"),
  HUMIDITY("Luftfeuchtigkeit", "%"),
  AIRPRESSURE("Luftdruck", "hPa"),
  PRECIPITATION("Niederschlag", "mm");

  private String description;
  private String unitOfMeasure;

  Sensor(String description, String unitOfMeasure) {
    this.description = description;
    this.unitOfMeasure = unitOfMeasure;
  }
}
