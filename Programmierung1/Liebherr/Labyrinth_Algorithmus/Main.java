package Labyrinth_Algorithmus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static String[][] Matrix;

  public static void main(String[] args) throws FileNotFoundException {
    File Labirinth = new File("Liebherr/Labyrinth_Algorithmus/Labirinth_Mouse.txt");
    Scanner myScanner = new Scanner(System.in);
    int startX = 1;
    int startY = 1;

    String ersteZeile = myScanner.nextLine();
    int Zeilen = 11; // Functions.countLines(Labirinth) + 1;
    int Laenge = 29; // ersteZeile.length() + 1;
    Matrix = new String[Zeilen][Laenge];

    Functions.readFileToMatrix(Labirinth, Matrix, Zeilen, Laenge);

    boolean MouseWalk = true;
    Set<String> visited = new HashSet<>();

    while (MouseWalk) {
      MouseWalk = Functions.solveLabyrinth(Matrix, startX, startY, visited);
    }

    System.out.println("Die Maus hat das Ziel erreicht!");
    myScanner.close();
  }
}
