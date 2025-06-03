package Bibliothek;

public enum Status {

	AVAILABLE("verfügbar"), LENT("verliehen");

	private final String description;

	Status(String desc) {
		this.description = desc;
	}

	public String getDescription() {
		return description;
	}
}
