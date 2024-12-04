package Übungsaufgaben.Parkhaus;

public class ParkingSpot {
	private final Vehicle vehicle;
	private final double lengthInM;
	private final double heightInM;
	private final boolean isForBussesOnly;

	public ParkingSpot(Vehicle vehicle, double lengthInM, double heightInM, boolean isForBussesOnly) {
		this.vehicle = vehicle;
		this.lengthInM = lengthInM;
		this.heightInM = heightInM;
		this.isForBussesOnly = isForBussesOnly;
	}
	
    public boolean isForBussesOnly() {
       return isForBussesOnly;
    }
}
