package Übungsaufgaben;

import java.util.Random;

public class Dice {
	
	Random myRandom = new Random();
	private final int id;
	private int value;
	
	public Dice(int id) {
		this.id = id;
	}
	public int getId() {
		System.out.print("Die ID des Würfels lautet: "); 
		return this.id;
		
	}
	public int getValue() {
		return this.value;
	}
	public void rollTheDice(int id) {
		System.out.println("ID - Würfelwert");
		for (int i = 0; i <= 5; i++) {
			this.value = myRandom.nextInt(1, 7);
			System.out.println(this.id + " - " + this.value);
		}
	}
	

}
