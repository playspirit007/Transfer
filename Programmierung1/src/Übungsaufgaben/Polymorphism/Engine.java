package Übungsaufgaben.Polymorphism;

public enum Engine {
	DIESEL("DIESEL"),
	PETROL("Benzin"),
	GAS("Gas"),
	ELECTRO("Elektro");
	
	private final String description;
	
	public Engine(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
