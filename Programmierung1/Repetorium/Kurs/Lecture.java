package Kurs;

public class Lecture {

  private final String code;
  private final String description;
  private final int creditPoints;

  public Lecture(String code, String description, int creditPoints) {
    this.code = code;
    this.description = description;
    this.creditPoints = creditPoints;
  }

  public int getCreditPoints() {
    return this.creditPoints;
  }
}
