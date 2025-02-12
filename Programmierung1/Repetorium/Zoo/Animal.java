package Zoo;

public class Animal {

  private final String description;
  private final double sizeInM;
  private final double weightInKg;

  public Animal(String description, double sizeInM, double weightInKg) {
    this.description = description;
    this.sizeInM = sizeInM;
    this.weightInKg = weightInKg;
  }

  public String getDescription() {
    return this.description;
  }

  public double getSizeInM() {
    return this.sizeInM;
  }

  public double getWeightInKg() {
    return this.weightInKg;
  }
}
