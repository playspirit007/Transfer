package Exceptions03;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Employee {
	private final int employeeId;
	private final Person person;
	private int salaryInEuro;

	public void setSalaryInEuro(int gehalt) throws SalaryIncreaseTooHighException, SalaryDecreaseException {
	    if (gehalt > this.salaryInEuro * 1.1) {
	        throw new SalaryIncreaseTooHighException("Gehalt ist zu hoch!");
	    } 
	    if (gehalt < this.salaryInEuro * 0.9) {
	        throw new SalaryDecreaseException();
	    }
	    this.salaryInEuro = gehalt;
	}
}