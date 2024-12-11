package Übungsaufgaben.Würfelspiel4;

public class Player {
	private final String name;
	private int points;
	
	public Player(String name) {
		this.name = name;
		this.points = 100;
	}
	
	public void setPoints(int points) {
		this.points -= points;
	}
	public int getPoints() {
		return this.points;
	}
	public String getName() {
		return this.name;
	}
		
}
