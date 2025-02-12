package Plätzchendose;

import java.util.List;

public class Cookie {
  private final String name;
  private final Recipe dough;

  public Cookie(String name, Recipe dough) {
    this.name = name;
    this.dough = dough;
  }

  public List<Ingredient> getIngredients() {
    return dough.getIngredients();
    //		for (Ingredient ingredientExample : )
  }

  public String getName() {
    return this.name;
  }
}
