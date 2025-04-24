package Exceptions02;

public class main {

	public static void main(String[] args) throws BarrelOverflowException {
		Car car1 = new Car("Porsche", "911", Engine.PETROL, 4);
		try {
			car1.accelerate(1);
		} catch (InvalidValueException e) {
			e.printStackTrace();
			System.out.print(e);
		}
		
		try {
			car1.brake(1);
		} catch (InvalidValueException e) {
			e.printStackTrace();
		}
		
		
		Barrel barrel1 = new Barrel(100);
		System.out.println(barrel1.getFluidLevel());
		barrel1.addFluid(10);
		System.out.println(barrel1.getFluidLevel());
		barrel1.addFluid(91);
		System.out.println(barrel1.getFluidLevel());

	}

}
