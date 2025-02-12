package Zoo;

import java.util.ArrayList;

public class Zoo {

  private final String name;
  private final ArrayList<Animal> animals;

  public Zoo(String name, ArrayList<Animal> animals) {
    this.name = name;
    this.animals = animals;
  }

  public void addAnimal(Animal animal) {
    this.animals.add(animal);
  }

  public Animal getBiggestAnimal() {
    Animal biggestAnimal = null;
    double highest = 0;
    for (Animal animal : animals) {
      if (highest < animal.getSizeInM()) {
        highest = animal.getSizeInM();
        biggestAnimal = animal;
      }
    }
    return biggestAnimal;
  }

  public Fish getFishesByColor(String colour) {
    for (Animal animal : animals) {
      if (animal instanceof Fish) {
        if (animal.getDescription().contains(colour)) {
          return (Fish) animal;
        }
      }
    }
    return null;
  }
}
