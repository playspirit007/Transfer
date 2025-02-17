package Übungsaufgaben.Würfelspiel1;

public class Player {
  private final String name;
  private int Points;

  public Player(String name, int Points) {
    this.name = name;
    this.Points = Points;
  }

  public void reducePoints(int value) {
    this.Points -= value;
  }

  public int getPoints() {
    return this.Points;
  }

  public String getName() {
    return this.name;
  }
}
