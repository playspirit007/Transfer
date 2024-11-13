package Übungsaufgaben;

import Übungsaufgaben.Vehicle;

public class Vehicle_main {

	public static void main(String[] args) {
		Vehicle Auto = new Vehicle("Audi", "A5", 45.00);
		System.out.println(Auto.toString());
		System.out.println(Auto.getSpeedInKmh());
		Auto.accelerate(150);
		Auto.brake(50);
		Auto.accelerate(30);
		Auto.accelerate(15);
		Auto.brake(100);
		Auto.brake(100);
	}

}
