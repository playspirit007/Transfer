package Übungsaufgaben.ClassDiagrams02;

public class Player2 {
	private final String name;
	private int score;
	private boolean isActive;
	private int numberOfActivePlayers;

	public Player2(String name) {
		this.name = name;
		this.isActive = true;
		numberOfActivePlayers += 1;
	}
	public String getName() {
		return this.name;
	}
	public int getScore() {
		System.out.print("");
		return this.score;
	}
	public boolean isActive() {
		return this.isActive;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public int getNumberOfActivePlayers() {
		return numberOfActivePlayers;
	}
}
