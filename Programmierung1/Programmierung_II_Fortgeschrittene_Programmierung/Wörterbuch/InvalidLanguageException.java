package Wörterbuch;

public class InvalidLanguageException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidLanguageException(String text) {
		super(text);
	}

}
