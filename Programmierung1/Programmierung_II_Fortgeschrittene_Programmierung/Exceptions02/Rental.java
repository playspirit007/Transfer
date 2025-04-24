package Exceptions02;

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
		return vehicles;
	}
	
	public void addVehicle(Vehicle v) {
		vehicles.add(v);
	}
	
	public void addAllVehicles (ArrayList<Vehicle> vehicles) {
		for (Vehicle v : vehicles) {
		this.vehicles.add(v);
		}
	}
	
	public void transformAllTrucks() {
		for (Vehicle v : vehicles) {
			if (v instanceof Truck) {
				((Truck) v).transform();
			}
		}
	}
	
	public String toString() {
		return "Rental: " + name + ", Vehicles: " + vehicles;
	}
	
}
