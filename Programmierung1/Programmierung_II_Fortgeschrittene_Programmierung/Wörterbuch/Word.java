package Wörterbuch;

public record Word(String value, Language language) implements Comparable<Word> {

	public int compareTo(Word other) {
		return this.value().compareTo(other.value());
	}
}
