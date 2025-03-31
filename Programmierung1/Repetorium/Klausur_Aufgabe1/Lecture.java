package Klausur_Aufgabe1;

public class Lecture {

  private final String description;
  private final int creditPoints;

  public Lecture(String description, int creditPoints) {
    this.creditPoints = creditPoints;
    this.description = description;
  }

  public String description() {
    return this.description;
  }

  public int creditPoints() {
    return this.creditPoints;
  }

  @Override
  public String toString() {
    return "description: " + this.description + " creditPoints: " + this.creditPoints;
  }
}
