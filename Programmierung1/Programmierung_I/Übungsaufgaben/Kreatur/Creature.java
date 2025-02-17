package Übungsaufgaben.Kreatur;

public class Creature {
	private final String name;
	private final Position position;
	private final Type type;

	public Creature(String name, Position position, Type type) {
	this.name = name;
	this.position = position;
	this.type = type;
	}
	public void moveUp() {
		position.increaseY();
	}
	public void moveDown() {
		position.decreaseY();
	}
	public void moveLeft() {
		position.decreaseX();
	}
	public void moveRight() {
		position.increaseX();
	}
}