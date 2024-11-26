package Übungsaufgaben.ClassDiagrams01;

public class Player {
	private final String name;
	private int score;
	private boolean isActive;

	public Player(String name) {
		this.name = name;
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
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
