package Plätzchendose;

import java.util.ArrayList;
import java.util.List;

public class StuffedCookie extends Cookie {
  private final Recipe jam;

  public StuffedCookie(String name, Recipe dough, Recipe jam) {
    super(name, dough);
    this.jam = jam;
  }

  @Override
  public List<Ingredient> getIngredients() {
    List<Ingredient> allIngredients = new ArrayList<>(super.getIngredients());
    allIngredients.addAll(jam.getIngredients());
    return allIngredients;
  }
}
