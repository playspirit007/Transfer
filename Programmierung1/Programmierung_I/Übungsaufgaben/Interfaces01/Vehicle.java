package Übungsaufgaben.Interfaces01;

public abstract class Vehicle {
	private String make;
	private String model;
	private Engine engine;
	protected double speedInKmh;
	private static int numberOfVehicles;
	
	public Vehicle(String make, String model, Engine engine) {
		this.make = make;
		this.model = model;
		this.engine = engine;
		numberOfVehicles++;
		this.speedInKmh = 0;
	}
	public String getMake() {
		return this.make;
	}
	public String getModel() {
		return this.model;
	}
	public Engine getEngine() {
		return this.engine;
	}
	public double getSpeedInKmh() {
		return this.speedInKmh;
	}
	public final void accelerate(int valueInKmh) {
		this.speedInKmh += valueInKmh;
	}
	public final void brake(int valueInKmh) {
		this.speedInKmh -= valueInKmh;
	}
	public abstract String toString();
	
	public static int getNumberOfVehicles() {
		return numberOfVehicles;
	}
}
