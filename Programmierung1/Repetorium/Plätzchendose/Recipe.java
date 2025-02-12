package Plätzchendose;

import java.util.ArrayList;

public class Recipe {
  private final String name;
  private final ArrayList<Ingredient> ingredients;

  public Recipe(String name) {
    this.name = name;
    ingredients = new ArrayList<>();
  }

  public void addIngredients(Ingredient ingredient) {
    this.ingredients.add(ingredient);
  }

  public ArrayList<Ingredient> getIngredients() {
    return this.ingredients;
  }

  public String getName() {
    return this.name;
  }
}
