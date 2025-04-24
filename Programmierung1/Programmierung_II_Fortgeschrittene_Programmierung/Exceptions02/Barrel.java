package Exceptions02;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Barrel {

	private int capacity;
	private int fluidLevel;

	public Barrel(int capacity) {
		this.capacity = capacity;
	}

	public void addFluid(int value) throws BarrelOverflowException {
		try {
			if (this.fluidLevel + value > this.capacity) {
				throw new BarrelOverflowException("Das war der Tropfen, der das Fass zum Überlaufen gebracht hat");
			}
		} catch (BarrelOverflowException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
		this.fluidLevel = this.fluidLevel + value;
	}
}
