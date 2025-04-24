package Exceptions01;

public class main {

	public static void main(String[] args) {
		Car car1 = new Car("Porsche", "911", Engine.PETROL, 4);
		try {
			car1.accelerate(-1);
		} catch (InvalidValueException e) {
			e.printStackTrace();
			System.out.print(e);
		}
		
		try {
			car1.brake(1);
		} catch (InvalidValueException e) {
			e.printStackTrace();
		}
	}
}