package Klausur_Aufgabe4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class IngredientsReader {

  public ArrayList<Ingredient> readIngredients(File file) throws FileNotFoundException {
    ArrayList<Ingredient> ingredients = new ArrayList<>();

    try (Scanner myScanner = new Scanner(file)) {
      while (myScanner.hasNextLine()) {
        String line = myScanner.nextLine().trim();
        Ingredient newIngredient = new Ingredient(line);

        if (!ingredients.contains(newIngredient)) {
          ingredients.add(newIngredient);
          System.out.println("Hinzugefügt: " + newIngredient);
        }
      }
    }
    return ingredients;
  }
}
