package Übungsaufgaben.Würfelspiel1;

public class Player {
	private final String name;
	private int points;
	
	public Player(String name, int points) {
		this.name = name;
		this.points = points;
	}
	
	public void reducePoints(int value) {
		this.points -= value;
		if (points < 0) {
            this.points = 0;
		}
	}
	public String getName() {
		return this.name;
	}
	public int getPoints() {
		return this.points;
	}
}
