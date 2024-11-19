package Übungsaufgaben;

public class Creature{
	private final String name;
	private final int attackValue;
	private int hitPoints;
	
	public Creature(String name, int attackValue, int hitPoints) {
		this.name = name;
		this.attackValue = attackValue;
		this.hitPoints = hitPoints;
		
	}
	public String getName() {
		return name;
	}
	public int getAttackValue() {
		return attackValue;
	}
	public int getHitPoints( ) {
		return hitPoints;
	}
	public void setHitPoints(int health) {
		this.hitPoints = health;
	}
	public void attackCreature(Creature enemy ) {
		enemy.hitPoints -= this.attackValue;
		}
	}
