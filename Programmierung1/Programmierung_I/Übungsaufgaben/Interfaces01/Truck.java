package Übungsaufgaben.Interfaces01;

public final class Truck extends Vehicle{
	private final int cargo;
	private boolean isTransformed;
	
	public Truck(String make, String model, Engine engine, int cargo) {
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
		if (this.isTransformed == false) {
			this.isTransformed = true;
			System.out.println(this.getMake() + " " + getModel() +"verwandelt sich in einen Autobot");
		} else if (this.isTransformed == true) {
			this.isTransformed = false;
			System.out.println(this.getMake() + " " + getModel() +"verwandelt sich in einen Lastwagen zurück.");
		}
	}
	public void transformAllTrucks() {
		Rental Rental1 = new Rental("");
	    for (Vehicle c : Rental1.getVehicles()) {
	        if (c instanceof Truck) {
	        	Truck truck = (Truck) c; //einmal casten
	            truck.transform();
	            System.out.println(truck.getMake() + " " + truck.getModel() + " hat sich transformiert!");
	        }
	    }
	}
	@Override
	public String toString() {
		return (this.getMake() + " " + this.getModel() + " " + "(" + this.getEngine() + ", " + this.cargo + " t)");
	}
	

}
