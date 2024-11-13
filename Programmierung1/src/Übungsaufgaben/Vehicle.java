package Übungsaufgaben;

public class Vehicle {

	private final String vehicle;
	private final String model;
	private double speedInKmh;
	
	public Vehicle(String vehicle, String model, double speedInKmh) {
		this.vehicle = vehicle;
		this.model = model;
		this.speedInKmh = speedInKmh;
	}
	
	public String getMake() {
		return vehicle;
	}
	
	public String getModel() {
		return model;
	}
	
	public double getSpeedInKmh() {
		return speedInKmh;
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
		return vehicle + " " + model;
	}
}
