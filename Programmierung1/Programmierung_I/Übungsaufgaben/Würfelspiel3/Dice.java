package Übungsaufgaben.Würfelspiel3;

import java.util.Random;

public class Dice {

	public int rollTheDice() {
		Random myRandom = new Random();
		int value = myRandom.nextInt(1, 7);
		return value;
	}
}
