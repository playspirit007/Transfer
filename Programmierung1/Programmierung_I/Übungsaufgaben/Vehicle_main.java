package Übungsaufgaben;

import Übungsaufgaben.Vehicle;

public class Vehicle_main {

	public static void main(String[] args) {
		System.out.println(Vehicle.getNumberOfVehicles());
		Vehicle Auto1 = new Vehicle("Audi", "A5", 45.00, Vehicle_Engine.DIESEL);
		Vehicle Auto2 = new Vehicle("Mercedes", "CL500", 82.00, Vehicle_Engine.PETROL);
		Vehicle Auto3 = new Vehicle("BMW", "i8", 34.00, Vehicle_Engine.ELECTRO);
		System.out.println(Auto1.toString());
		System.out.println(Auto1.getSpeedInKmh());
		Auto1.accelerate(150);
		Auto1.brake(50);
		Auto1.accelerate(30);
		Auto1.accelerate(15);
		Auto1.brake(100);
		Auto1.brake(100);
		System.out.println(Vehicle.getNumberOfVehicles());
	}

}
