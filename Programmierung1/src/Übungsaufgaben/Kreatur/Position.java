package Übungsaufgaben.Kreatur;

public class Position {
	private int x;
	private int y;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void increaseX() {
		this.x += 1;
	}

	public void increaseY() {
		this.x += 1;
	}

	public void decreaseX() {
		this.x -= 1;
	}

	public void decreaseY() {
		this.x -= 1;
	}
}