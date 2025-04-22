package Exceptions01;

public final class Truck extends Vehicle {
    private final int cargo;
    private boolean isTransformed;

    public Truck(String make, String model, Engine engine, int cargo) {
        super(make, model, engine);
        this.cargo = cargo;
        this.isTransformed = false;
    }

    public int getCargo() {
        return cargo;
    }

    public boolean isTransformed() {
        return isTransformed;
    }

    public void transform() {
        this.isTransformed = true;
    }

    @Override
    public String toString() {
        return "Truck: " + getMake() + " " + getModel() + ", Cargo: " + cargo + ", Transformed: " + isTransformed;
    }
}

