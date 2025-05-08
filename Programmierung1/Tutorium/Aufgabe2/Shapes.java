package Aufgabe2;

import java.util.HashMap;
import java.util.Map.Entry;

import Geometrische_Form.Shape;

public record Shapes(HashMap<Shape, Integer> entries) {
	
	public void addEntry(Shape shape, int amount) throws NullObjectException, InvalidAmountException {
		if (shape == null) {
			throw new NullObjectException("Keine Form angegeben!");
		} else if (amount <= 0) {
			throw new InvalidAmountException("Ungültige Menge!");
		}
		entries.put(shape, amount);
	}
	
	public Shape getShapeWithLargestArea() {
		Shape zwischen = null;
		double area = 0;
		for (Entry<Shape, Integer> entry : entries.entrySet()) {
			if (entry.getKey().getAreaInCm2() > area) {
				area = entry.getKey().getAreaInCm2();
				zwischen = entry.getKey();
			}
		}
		return zwischen;
		
	}

}
