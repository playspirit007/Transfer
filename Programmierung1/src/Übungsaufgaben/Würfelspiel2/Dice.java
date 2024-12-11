package Übungsaufgaben.Würfelspiel2;

import java.util.Random;

public class Dice {
	public ShapeSymbol rollTheDice() {
		Random myRandom = new Random();
		ShapeSymbol shapesymbol = ShapeSymbol.CIRCLE;
		int value = myRandom.nextInt(1, 4);
		if (value == 1) {
			shapesymbol = ShapeSymbol.CIRCLE;
		} else if (value == 2) {
			shapesymbol = ShapeSymbol.TRIANGLE;
		} else if (value == 3) {
			shapesymbol = ShapeSymbol.SQUARE;
		}
		return shapesymbol;
	}
}
