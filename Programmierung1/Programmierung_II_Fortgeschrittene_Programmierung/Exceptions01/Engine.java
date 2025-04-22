package Exceptions01;

public enum Engine {
	DIESEL("Diesel"),
	PETROL("Benzin"),
	GAS("Gas"),
	ELECTRO("Elektro");
	private final String description;

	Engine(String string) {
		this.description = string;
	}

	public String getDescription() {
		return this.description;
	}
}
