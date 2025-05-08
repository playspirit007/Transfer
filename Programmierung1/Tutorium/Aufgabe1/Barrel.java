package Aufgabe1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Barrel {

	private int capacity;
	private int fluidLevel;
	
	public void addFluid(int value) throws BarrelOverflowException {
		if ((this.fluidLevel += value) > this.capacity) {
			fluidLevel = capacity;
			throw new BarrelOverflowException("Das war der Tropfen, der das Fass zum überlaufen gebracht hat!");
		}
		else {
			this.fluidLevel += value;
		}
	}
}


