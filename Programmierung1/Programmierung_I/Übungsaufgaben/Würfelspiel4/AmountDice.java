package Übungsaufgaben.Würfelspiel4;

import java.util.Random;

public class AmountDice {
	public int rollTheDice() {
		Random myRandom = new Random();
		int x = myRandom.nextInt(1, 7);
		return x;
	}
}
