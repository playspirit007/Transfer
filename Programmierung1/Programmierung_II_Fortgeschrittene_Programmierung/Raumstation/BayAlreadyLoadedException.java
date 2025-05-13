package Raumstation;

public class BayAlreadyLoadedException extends Exception {

	private static final long serialVersionUID = 1L;

	public BayAlreadyLoadedException(String text) {
		super(text);
	}

}