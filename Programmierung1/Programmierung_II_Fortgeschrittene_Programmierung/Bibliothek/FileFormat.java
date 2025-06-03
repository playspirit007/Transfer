package Bibliothek;

public enum FileFormat {

	AZW("Amazon Kindle"), EPUB("Electronic Publication"), LRF("Portable Reader File");

	private final String description;

	FileFormat(String desc) {
		this.description = desc;
	}
}
