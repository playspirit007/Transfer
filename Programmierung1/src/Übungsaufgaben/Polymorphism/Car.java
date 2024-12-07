package Übungsaufgaben.Polymorphism;

public class Car extends Vehicle{
	private final int seats;
	
	public Car(String model, Engine engine, int seats) {
		super(model, engine);
		this.seats = seats;
	}
	public int getSeats() {
		return this.seats;
	}
	public void doATurboBoost() {
		double x = getSpeedInKmh();
		int y = (int) x;
		accelerate(y);
	} public String toString() {
		return (getMake() + " " + getModel() + " (" + getEngine() + ", " + getSeats() + " Sitzplätze" + ")");
	}
}
