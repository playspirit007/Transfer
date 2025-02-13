package Würfelspiel4;

public class Player {

  private final String name;
  private int points;

  public Player(String name, int points) {
    this.name = name;
    this.points = points;
  }

  public String getName() {
    return this.name;
  }

  public void setPoints(int points) {
    this.points -= points;
  }

  public int getPoints() {
    return this.points;
  }
}
