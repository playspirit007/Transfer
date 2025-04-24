package Exceptions03;

public class main {

	public static void main(String[] args) {
		Person person1 = new Person("Elias");
		Employee elias = new Employee(1, person1, 1000);
		
		try {
			elias.setSalaryInEuro(1101);
		} catch (SalaryDecreaseException e1) {
			e1.getStackTrace();
			System.out.println(e1);
		} catch (SalaryIncreaseTooHighException e2) {
			e2.getStackTrace();
			System.out.println(e2);
		}
		
	}

}
