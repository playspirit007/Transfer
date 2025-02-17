package Übungsaufgaben.ClassDiagrams02;

import java.util.Random;

public class Dice2 {
	private int id;
	private int value;
	
	public Dice2(int id) {
		this.id = id;
	}
	public void rollTheDice() {
		Random myRandom = new Random();
		this.value = myRandom.nextInt(1, 7); 
	}
	public int getId() {
		return this.id;
	}
	public int getValue() {
		return this.value;
	}
	
}
