package Übungsaufgaben.Interfaces01;

public class MainClass {

	public static void main(String[] args) {
		Car car1 = new Car("Porsche", "911", Engine.ELECTRO, 2);
		Car car2 = new Car("Opel", "Zafria Life", Engine.DIESEL, 7);
		Truck truck1 = new Truck("MAN", "TGX", Engine.DIESEL, 20);
		
		TravelAgency Travel1 = new TravelAgency("Reisebüro Schmidt");
		Rental Rental0 = new Rental("Fahrzeugvermietung Müller");
		Travel1.addPartner(Rental0);
		Rental0.addVehicle(truck1);
		Rental0.addVehicle(car1);
		Rental0.addVehicle(car2);
		
		
		System.out.println(Travel1.toString());

	}

}
