package Zoo;

public class Bird extends Animal {
  public Bird(String description, double sizeInM, double weightInKg) {
    super(description, sizeInM, weightInKg);
  }

  public void fly() {
    System.out.println("flatter, flatter");
  }
}
