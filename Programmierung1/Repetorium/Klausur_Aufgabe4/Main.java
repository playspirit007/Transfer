package Klausur_Aufgabe4;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {
    IngredientsReader Reader = new IngredientsReader();
    File file = new File("Programmierung_I/Klausur_Aufgabe4/Zutaten");
    System.out.println(Reader.readIngredients(file));
  }
}
