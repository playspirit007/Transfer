package Aufgabe2;

public class InvalidAmountException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidAmountException(String text) {
		super(text);
	}
}
