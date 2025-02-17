package Übungsaufgaben;

public enum Vehicle_Engine {
	DIESEL("Diesel"),
	PETROL("Benzin"),
	GAS("Autogas"),
	ELECTRO("Elektro");
	
	private final String description;


	Vehicle_Engine(String description) {
	this.description = description;
	}
	public String getDescription() {
		return this.description;
	}
}
