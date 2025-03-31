package Klausur_Aufgabe4;

import java.util.ArrayList;

public class StuffedCookie extends Cookie {

  private final Recipe jam;

  public StuffedCookie(String name, Recipe dough, Recipe jam) {
    super(name, dough);
    this.jam = jam;
  }

  @Override
  public ArrayList<Ingredient> getIngredients() {
    ArrayList<Ingredient> ingredients = super.getIngredients();
    return ingredients;
  }

public Recipe getJam(){return jam;}
}
