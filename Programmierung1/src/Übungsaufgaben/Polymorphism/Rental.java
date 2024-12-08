package Übungsaufgaben.Polymorphism;

import java.util.ArrayList;

public class Rental {
	private final String name;
	private final ArrayList<Vehicle> vehicles;
	
	public Rental(String name) {
		this.name = name;
		vehicles = new ArrayList<>();
	}
	public String getName() {
		return this.name;
	}
	public ArrayList<Vehicle> getVehicles() {
		return this.vehicles;
	}
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	public void addAllVehicles(ArrayList<Vehicle> addvehicles) {
		for (Vehicle c : addvehicles) {
			this.vehicles.add(c);
		}
	}
	public String toString() {
		System.out.println("Fahrzeugvermietung Müller");
		System.out.println("Unsere Fahrzeuge:");
		for (Vehicle c : vehicles) {
			System.out.println(c.toString());
		}
		return ("");
	}
}
