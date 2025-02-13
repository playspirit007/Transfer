package Labyrinth_Algorithmus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static String[][] Matrix;

  public static void main(String[] args) throws FileNotFoundException, InterruptedException {
    File Labyrinth = new File("Liebherr/Labyrinth_Algorithmus/Labirinth_Mouse.txt");
    Scanner myScanner = new Scanner(Labyrinth);
    int startX = 1;
    int startY = 1;
    String ersteZeile = myScanner.nextLine();

    int Zeilen = Functions.countLines(Labyrinth) + 1;
    int Laenge = ersteZeile.length();
    Matrix = new String[Zeilen][Laenge];

    Functions.readFileToMatrix(Labyrinth, Matrix, Zeilen, Laenge);

    boolean MouseWalk = true;
    Set<String> visited = new HashSet<>();

    while (MouseWalk) {
      MouseWalk = Functions.solveLabyrinth(Matrix, startX, startY, visited);
    }

    System.out.println("Die Maus hat das Ziel erreicht!");
    myScanner.close();
  }
}
