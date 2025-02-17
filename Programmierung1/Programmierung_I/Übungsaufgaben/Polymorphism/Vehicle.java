package Übungsaufgaben.Polymorphism;

import java.util.ArrayList;

public class Vehicle {
	private final String make;
	private final String model;
	private final Engine engine;
	protected double speedInKmh;
	private static int numberOfVehicles;
	private ArrayList<Vehicle> AllVehicles = new ArrayList<>();
	
	public Vehicle (String make, String model, Engine engine) {
		this.make = make;
		this.model = model;
		this.engine = engine;
		this.speedInKmh = 0;
		numberOfVehicles++;
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
		System.out.println(getMake() + " " + getModel() + " beschleunigt auf " + this.speedInKmh + "km/h");
	}
	public void brake(int valueInKmh) {
		this.speedInKmh -= valueInKmh;
		System.out.println(getMake() + " " + getModel() + " bremst auf " + this.speedInKmh + "km/h ab");
	}
	public String toString() {
		return ("[Vehicle]: make: " + this.make + " model: " + this.model + " Engine: " + this.engine + " Speed in Kmh: " +this.speedInKmh);
	}
	public static String getNumerOfVehicles() {
		return ("Anzahl der Fahrzeuge: " + numberOfVehicles);
	}
	public void addAllVehicle(Vehicle vehicle) {
		this.AllVehicles.add(vehicle);
	}
}
