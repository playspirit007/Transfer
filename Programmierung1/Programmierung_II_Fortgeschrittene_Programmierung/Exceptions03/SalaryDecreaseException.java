package Exceptions03;

public class SalaryDecreaseException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public SalaryDecreaseException() {
		super("Gehalt ist niedriger als Zuvor!");
	}

}
