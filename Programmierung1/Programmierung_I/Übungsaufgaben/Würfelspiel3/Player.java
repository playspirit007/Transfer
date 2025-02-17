package Übungsaufgaben.Würfelspiel3;

public class Player {
	private final String name;
	private final Dice dice;
	private int healthPoints;
	
	public Player(String name) {
		this.name = name;
		this.healthPoints = 10;
		this.dice = new Dice();
	}
	public void reduceHealthPoints(int points) {
		this.healthPoints -= points;
	}
	public String getName() {
		return this.name;
	}
	public int getHealthPoints() {
		return this.healthPoints;
	}
	public int rollTheDice() {
		int value = dice.rollTheDice();
		return value;
	}
}
