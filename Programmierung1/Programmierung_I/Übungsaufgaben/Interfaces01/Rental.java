package Übungsaufgaben.Interfaces01;

import java.util.ArrayList;

import model.Truck;

public class Rental implements Partner{
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
		return (ArrayList<Vehicle>) vehicles;
	}
	public void addVehicle(Vehicle v) {
		this.vehicles.add(v);
	}
	public void addAllVehicles(ArrayList<Vehicle> AllVehicles) {
		for (Vehicle c : AllVehicles) {
			this.vehicles.add(c);
		}
	}
	public String toString() {
		System.out.println(this.name);
		System.out.println("Unsere Fahrzeuge:");
		for (Vehicle c : vehicles) {
			System.out.println(c.toString());
		}
		return "";
		
	}
}
