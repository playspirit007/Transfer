package Tiefgarage;

public class ParkingSpot {

  private Vehicle vehicle;
  private final double lengthInM;
  private final double heightInM;
  private final boolean isForBusesOnly;

  public ParkingSpot(double lengthInM, double heightInM, boolean isForBusesOnly) {
    this.lengthInM = lengthInM;
    this.heightInM = heightInM;
    this.isForBusesOnly = isForBusesOnly;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public Vehicle getVehicle() {
    return this.vehicle;
  }

  public boolean getIsForBusesOnly() {
    return this.isForBusesOnly;
  }
}
