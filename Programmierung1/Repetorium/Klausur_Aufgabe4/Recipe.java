package Klausur_Aufgabe4;

import java.util.ArrayList;

public class Recipe {

  private final String name;
  private final ArrayList<Ingredient> ingredients;

  public Recipe(String name) {
    this.name = name;
    ingredients = new ArrayList<>();
  }

  public void addIngredient(Ingredient ingredient) {
    ingredients.add(ingredient);
  }

  public ArrayList<Ingredient> getIngredient() {
    return this.ingredients;
  }

public String getName(){return name;}
}
