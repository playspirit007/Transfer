package Labyrinth_Algorithmus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
  public static String[][] Matrix;

  public static void main(String[] args) throws FileNotFoundException {
    File Labirinth = new File("Liebherr/Labyrinth_Algorithmus/Labirinth_Mouse.txt");
    Scanner myScanner = new Scanner(System.in);
    int startX = 1;
    int startY = 1;

    int Zeilen = 11; // Functions.countLines(Labirinth) + 1;
    int Laenge = 31; // ersteZeile.length() + 1;
    Matrix = new String[Zeilen][Laenge];

    Functions.readFileToMatrix(Labirinth, Matrix, Zeilen, Laenge);

    boolean MouseWalk = true;
    while (MouseWalk) {
      MouseWalk = Functions.solveLabyrinth(Matrix, startX, startY);
      //      myScanner.nextLine();
      //      int i = 1;
      //      while (i < 7) {
      //        System.out.println(" ");
      //        i++;
      //      }
      //      Functions.printMatrix(Matrix);

      // Ausgabe nur, wenn Maus das Labyrinth verlässt
      if (!MouseWalk) {
        System.out.println("Die Maus hat das Labyrinth verlassen!");
        break; // Beendet die Schleife, wenn die Maus das Ziel erreicht hat
      }
    }

    System.out.println("Die Maus hat das Ziel erreicht!");
    myScanner.close();
  }
}
