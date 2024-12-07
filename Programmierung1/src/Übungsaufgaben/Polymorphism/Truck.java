package Übungsaufgaben.Polymorphism;

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
		} else if (this.isTransformed == false) {
			this.isTransformed = true;
		}
	}
	public String toString() {
		return(getMake() + " " + getModel() + " (" + getEngine() + ", " + getCargo());
	}
}
