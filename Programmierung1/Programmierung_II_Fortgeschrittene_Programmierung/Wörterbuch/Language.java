package Wörterbuch;

public enum Language {

	DE(DE, "Deutsch"), EN(EN, "Englisch");

	private final String code;
	private final String description;
	
	Language(String code, String description) {
		this.code = code;
		this.description = description;
	}

}
