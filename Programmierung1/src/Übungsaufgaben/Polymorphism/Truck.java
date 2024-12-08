package Übungsaufgaben.Polymorphism;

import java.util.ArrayList;

public class Truck extends Vehicle{
	private final int cargo;
	private boolean isTransformed;
	
	Truck(String make, String model, Engine engine, int cargo){
		super(make, model, engine);
		this.cargo = cargo;
	}
	public int getCargo() {
		return this.cargo;
	}
	public boolean isTransformed() {
		return this.isTransformed;
	}
	public void transform() {
		if (this.isTransformed == true) {
			this.isTransformed = false;
			System.out.println(getMake() + " " + getModel() + " verwandelt sich in ein Lastenwagen zurück.");
		} else if (this.isTransformed == false) {
			this.isTransformed = true;
			System.out.println(getMake() + " " + getModel() + " verwandelt sich in ein Autobot.");
		}
	}
	public void transformAllTrucks(ArrayList<Vehicle> allVehicles) {
		for (Vehicle c : allVehicles) {
			if (c instanceof Truck) {
				((Truck) c).isTransformed = true;
				System.out.println(((Truck) c).getMake() + " " + ((Truck) c).getModel() + " hat sich transformiert!");
			}
		}
	}
	public String toString() {
		return(getMake() + " " + getModel() + " (" + getEngine() + ", " + getCargo() + "t)");
	}
}
