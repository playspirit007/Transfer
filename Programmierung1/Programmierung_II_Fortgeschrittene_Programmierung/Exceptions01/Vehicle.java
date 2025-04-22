package Exceptions01;

	public abstract class Vehicle {
	    private String make;
	    private String model;
	    private Engine engine;
	    protected double speedInKmH;
	    private static int numberOfVehicles = 0;

	    public Vehicle(String make, String model, Engine engine) {
	        this.make = make;
	        this.model = model;
	        this.engine = engine;
	        numberOfVehicles++;
	    }

	    public String getMake() {
	        return make;
	    }

	    public String getModel() {
	        return model;
	    }

	    public Engine getEngine() {
	        return engine;
	    }

	    public double getSpeedInKmH() {
	        return speedInKmH;
	    }

	    public final void accelerate(double valueInKmH) throws InvalidValueException {
	    	if (valueInKmH <= 0) {
	    		throw new InvalidValueException("valueInKmh", valueInKmH);
	    	}
	        this.speedInKmH += valueInKmH;
	    }

	    public final void brake(double valueInKmH) throws InvalidValueException {
	    	if (valueInKmH <= 0) {
	    		throw new InvalidValueException("valueInKmh", valueInKmH);
	    	}
	        this.speedInKmH = Math.max(0, this.speedInKmH - valueInKmH);
	    }

	    public static int getNumberOfVehicles() {
	        return numberOfVehicles;
	    }

	    @Override
	    public abstract String toString();
	}
