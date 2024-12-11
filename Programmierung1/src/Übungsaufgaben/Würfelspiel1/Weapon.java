package Übungsaufgaben.Würfelspiel1;

public enum Weapon {
	SWORD("Schwert", 4), SPEAR("Speer", 2), AXE("Axt", 3), CLUB("Keule", 1);

	private final String description;
	private final int power;

	 Weapon(String description, int power) {
		    this.description = description;
		    this.power = power;
	}
	 
	public int getPower() {
		return this.power;
	}

	public String getWeaponDescription() {
		return this.description;
	}
}