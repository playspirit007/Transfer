package Übungsaufgaben;

import Übungsaufgaben.Vehicle_Engine;

public class Vehicle {

	private final String vehicle;
	private final String model;
	private double speedInKmh;
	private static int numberOfVehicles; 
	private final Vehicle_Engine Engine;
	
	public Vehicle(String vehicle, String model, double speedInKmh, Vehicle_Engine engine) {
		this.vehicle = vehicle;
		this.model = model;
		this.speedInKmh = speedInKmh;
		this.Engine = engine;
		numberOfVehicles += 1; 
	}
	public static int getNumberOfVehicles() {
		System.out.print("Anzahl der Fahrzeuge: ");
		return numberOfVehicles;
	}
	public String getMake() {
		return vehicle;
	}
	
	public String getModel() {
		return model;
	}
	public Vehicle_Engine getEngine() {
		return this.Engine;
	}
	
	public String getSpeedInKmh() {
		return speedInKmh + " km/h";
	} 
	public void accelerate(int valueInKmh) {
		speedInKmh += valueInKmh; 
		System.out.println(vehicle + " "+ model + " beschleunigt auf " + speedInKmh + "km/h");
	}
	
	public void brake(int valueInKmh) {
		speedInKmh -= valueInKmh;
		if (speedInKmh < 0) {
			speedInKmh = 0;
		}
		System.out.println(vehicle + " " + model + " bremst auf " + speedInKmh + "km/h ab");
	}
	
	public String toString() {
		return vehicle + " " + model + " " + Engine;
	}
}
