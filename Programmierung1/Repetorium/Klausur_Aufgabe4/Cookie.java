package Klausur_Aufgabe4;

import java.util.ArrayList;

public class Cookie {

  private final String name;
  private final Recipe dough;

  public Cookie(String name, Recipe dough) {
    this.name = name;
    this.dough = dough;
  }

  public ArrayList<Ingredient> getIngredients() {
    return dough.getIngredient();
  }

  public String getName() {
    return name;
  }
}
