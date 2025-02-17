package Übungsaufgaben.Polymorphism;

public enum Engine {
	DIESEL("DIESEL"),
	PETROL("Benzin"),
	GAS("Gas"),
	ELECTRO("Elektro");
	
	private final String description;
	
	Engine(String description) {
		this.description = description;
	}
}
