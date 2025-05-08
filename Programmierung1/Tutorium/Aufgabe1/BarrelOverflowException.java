package Aufgabe1;

public class BarrelOverflowException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public BarrelOverflowException(String text) {
		super(text); 
	}

}
