package Wetterstation;

public class MeasurementValue {

  private final long timestamp;
  private final double value;
  private final Sensor sensor;

  public MeasurementValue(long timestamp, double value, Sensor sensor) {
    this.timestamp = timestamp;
    this.value = value;
    this.sensor = sensor;
  }

  public long getTimestamp() {
    return this.timestamp;
  }

  public Sensor getSensor() {
    return this.sensor;
  }

  public double getValue() {
    return this.value;
  }
}
