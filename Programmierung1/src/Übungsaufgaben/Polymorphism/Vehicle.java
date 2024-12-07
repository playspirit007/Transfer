package Übungsaufgaben.Polymorphism;

public class Vehicle {
	private final String make;
	private final String model;
	private final Engine engine;
	protected double speedInKmh;
	private static int numberOfVehicles;
	
	public Vehicle(String model, Engine engine) {
		this.model = model;
		this.engine = engine;
	}
	public String getModel() {
		return this.model;
	}
	public String getMake() {
		return this.make;
	}
	public Engine getEngine() {
		return this.engine;
	}
	public double getSpeedInKmh() {
		return this.speedInKmh;
	}
	public void accelerate(int valueInKmh) {
		this.speedInKmh += valueInKmh;
	}
	public void brake(int valueInKmh) {
		this.speedInKmh -= valueInKmh;
	}
	public String toString() {
		return ("[Vehicle]: make: " + this.make + " model: " + this.model + " Engine: " + this.engine + " Speed in Kmh: " +this.speedInKmh);
	}
	public static int getNumerOfVehicles() {
		return numberOfVehicles;
	}
}
