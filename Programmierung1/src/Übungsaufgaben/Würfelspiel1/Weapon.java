package Übungsaufgaben.Würfelspiel1;

public enum Weapon {
	SWORD("Schwert", 4),
	SPEAR("Speer", 3),
	AXE("Axt", 2),
	CLUB("Keule", 1);

	private final String description;
	private final int power;
	
	Weapon(String description, int power) {
		this.description = description;
		this.power = power;
	}

	public String getDescription() {
		return description;
	}

	public int getPower() {
		return power;
	}
	
}

