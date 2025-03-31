package Klausur_Aufgabe3;

public class Player {

  private final String name;
  private int healthPoints;
  private final Dice dice;

  public Player(String name) {
    this.name = name;
    this.healthPoints = 10;
    dice = new Dice();
  }

  public String name() {
    return this.name;
  }

  public int getHealthPoints() {
    return this.healthPoints;
  }

  public void reduceHealthPoints() {
    this.healthPoints = this.healthPoints - 1;
  }

  public int rollTheDice() {
    dice.rollTheDice();
    return dice.getValue();
  }
}
