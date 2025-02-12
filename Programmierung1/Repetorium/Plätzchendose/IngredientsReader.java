package Plätzchendose;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IngredientsReader {
  private final File file;

  // Konstruktor, der die Datei als Eingabe nimmt
  public IngredientsReader(String filePath) {
    this.file = new File(filePath);
  }

  public List<String> readIngredients() throws FileNotFoundException {
    List<String> ingredients = new ArrayList<>();
    Scanner myScanner = new Scanner(file);

    while (myScanner.hasNextLine()) {
      ingredients.add(myScanner.nextLine().trim());
    }
    myScanner.close();
    return ingredients;
  }
}
