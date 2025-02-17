package Übungsaufgaben.Polymorphism;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		System.out.println(Vehicle.getNumerOfVehicles());
		Car car1 = new Car("Porsche", "911", Engine.ELECTRO, 2);
		Truck truck1 = new Truck("MAN", "TGX", Engine.DIESEL, 20);
		Car car2 = new Car("Opel", "Zafira Life", Engine.PETROL, 7);
		System.out.println(Vehicle.getNumerOfVehicles());
		System.out.println(car1.toString());
		System.out.println(truck1.toString());
		System.out.println(car2.toString());
		car1.accelerate(50);
		truck1.transform();
		car1.doATurboBoost();
		truck1.transform();
		
		System.out.println("");
		System.out.println("");
		
		
		Rental rental1 = new Rental("Fahrzeugvermietung Schwarz");
		rental1.addVehicle(car1);
		ArrayList<Vehicle> addvehicles = new ArrayList<>();
		addvehicles.add(car2);
		addvehicles.add(truck1);
		rental1.addAllVehicles(addvehicles);
		rental1.toString();
		
		
		System.out.println("");
		System.out.println("");
		
		ArrayList<Vehicle> AllVehicles = new ArrayList<>();
		Truck truck2 = new Truck("IVECO", "FRD", Engine.DIESEL, 26);
		AllVehicles.add(car1);
		AllVehicles.add(car2);
		AllVehicles.add(truck1);
		AllVehicles.add(truck2);
		truck1.transformAllTrucks(AllVehicles);
		
		System.out.println(AllVehicles);
		
		
	}

}
