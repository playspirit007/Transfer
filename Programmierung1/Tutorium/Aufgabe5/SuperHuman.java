package Aufgabe5;

public abstract class SuperHuman {

  private final String name;
  private final Universe universe;
  private final int power;

  public SuperHuman(String name, Universe universe, int power) {
    this.name = name;
    this.power = power;
    this.universe = universe;
  }

public String getName(){return name;}

public Universe getUniverse(){return universe;}

public int getPower(){return power;}
}
