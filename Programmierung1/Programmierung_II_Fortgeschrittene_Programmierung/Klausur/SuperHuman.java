package Klausur;

public abstract class SuperHuman {

	private final String name;
	private final Universe universe;
	private final int power;
	
	public SuperHuman(String name, Universe universe, int power) {
		this.name = name;
		this.power = power;
		this.universe = universe;
	}
	
	public String name() {
		return this.name();
	}
	
	public Universe universe() {
		return this.universe;
	}
	
	public int power() {
		return this.power;
	}
}
