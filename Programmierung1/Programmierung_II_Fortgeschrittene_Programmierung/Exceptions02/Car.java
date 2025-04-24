package Exceptions02;

public final class Car extends Vehicle {
    private int seats;

    public Car(String make, String model, Engine engine, int seats) {
        super(make, model, engine);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void doTurboBoost() {
			try {
				accelerate(20);
			} catch (InvalidValueException e) {
				e.printStackTrace();
			}
	}
    
    @Override
    public String toString() {
        return "Car: " + getMake() + " " + getModel() + ", Seats: " + seats;
    }
}
