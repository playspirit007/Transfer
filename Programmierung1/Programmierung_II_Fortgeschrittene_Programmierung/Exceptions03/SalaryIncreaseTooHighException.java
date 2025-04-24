package Exceptions03;

public class SalaryIncreaseTooHighException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public SalaryIncreaseTooHighException (String text) {
		super(text);
	}
}
