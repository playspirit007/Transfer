package Übungsaufgaben.Interfaces01;

public final class Car extends Vehicle{
	private final int seats;
	
	public Car(String make, String model, Engine engine, int seats) {
		super(make, model, engine);
		this.seats = seats;
	}
	public int getSeats() {
		return this.seats;
	}
	public void doATurboBoost() {
		this.speedInKmh = (this.speedInKmh * 2);
	}
	public String toString() {
		return (this.getMake() + " " + this.getModel() + " " + "(" + this.getEngine() + ", " + this.seats + " Sitzplätze)");
	}
}
