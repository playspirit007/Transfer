package Zoo;

import java.util.ArrayList;

public class Fish extends Animal {
  static ArrayList<Fish> fishes = new ArrayList<>();

  public Fish(String description, double sizeInM, double weightInKg) {
    super(description, sizeInM, weightInKg);
  }

  public void swim() {
    System.out.println("schwimm, schwimm");
  }
}
