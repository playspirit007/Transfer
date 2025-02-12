package Labyrinth_Algorithmus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Functions {

  private static Scanner myScanner = new Scanner(System.in);

  public static boolean solveLabyrinth(String[][] matrix, int row, int col) {
    myScanner.nextLine();
    int i = 1;
    while (i < 7) {
      System.out.println(" ");
      i++;
    }
    Functions.printMatrix(matrix);
    // Überprüfen, ob das Ziel 'X' erreicht wurde
    Scanner myScanner = new Scanner(System.in);
    if (matrix[row][col].equals("X")) {
      matrix[row][col] = "O"; // Ziel erreicht, "O" setzen
      return false; // Maus hat das Ziel erreicht, daher keine weitere Bewegung nötig
    }

    // Wenn die aktuelle Position leer ist und nicht besucht wurde, setze die Maus 'O'
    if (matrix[row][col].equals(" ") || matrix[row][col].equals(".")) {
      matrix[row][col] = "O"; // Setze das "O" an der aktuellen Position
    } else {
      return true; // Wenn die Position bereits besucht wurde, gehe zurück
    }

    // Überprüfe, ob es nach unten geht und kein Block (kein '*')
    if (row + 1 < matrix.length && !matrix[row + 1][col].equals("*")) {
      if (!solveLabyrinth(matrix, row + 1, col)) { // Rekursiver Aufruf nach unten
        return false; // Wenn Ziel erreicht, gebe false zurück
      }
    }

    // Überprüfe, ob es nach rechts geht und kein Block (kein '*')
    if (col + 1 < matrix[0].length && !matrix[row][col + 1].equals("*")) {
      if (!solveLabyrinth(matrix, row, col + 1)) { // Rekursiver Aufruf nach rechts
        return false; // Wenn Ziel erreicht, gebe false zurück
      }
    }

    // Überprüfe, ob es nach oben geht und kein Block (kein '*')
    if (row - 1 >= 0 && !matrix[row - 1][col].equals("*")) {
      if (!solveLabyrinth(matrix, row - 1, col)) { // Rekursiver Aufruf nach oben
        return false; // Wenn Ziel erreicht, gebe false zurück
      }
    }

    // Überprüfe, ob es nach links geht und kein Block (kein '*')
    if (col - 1 >= 0 && !matrix[row][col - 1].equals("*")) {
      if (!solveLabyrinth(matrix, row, col - 1)) { // Rekursiver Aufruf nach links
        return false; // Wenn Ziel erreicht, gebe false zurück
      }
    }

    // Wenn keine gültige Richtung funktioniert hat, gebe true zurück (backtracking)
    matrix[row][col] = "."; // Markiere die Position als besucht
    return true; // Keine Richtung führt zum Ziel, daher gehe zurück und versuche es an anderer
    // Stelle
  }

  public static void readFileToMatrix(File file, String[][] matrix, int zeilen, int laenge) {
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      String line;
      int currentRow = 0;

      // Zeile für Zeile einlesen
      while ((line = reader.readLine()) != null && currentRow < zeilen) {
        // Sicherstellen, dass die Zeile nicht mehr als `laenge` Zeichen hat
        String[] row =
            line.length() > laenge ? line.substring(0, laenge).split("") : line.split("");

        // Übertrage die Zeichen in die Matrix
        for (int i = 0; i < row.length && i < laenge; i++) {
          matrix[currentRow][i] = row[i];
        }
        currentRow++;
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static int countLines(File file) {
    int lines = 0;
    if (!file.exists() || !file.isFile()) {
      System.err.println("Die Datei existiert nicht oder ist ungültig.");
      return -1;
    }

    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      while (reader.readLine() != null) {
        lines++;
      }
    } catch (IOException e) {
      System.err.println("Fehler beim Lesen der Datei: " + e.getMessage());
    }
    return lines;
  }

  public static void printMatrix(String[][] matrix) {
    if (matrix == null) {
      System.out.println("Matrix ist leer!");
      return;
    }

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        // Wenn der Wert null ist, geben wir einen Platzhalter wie "*" aus, andernfalls das Zeichen
        System.out.print((matrix[i][j] != null ? matrix[i][j] : "*"));
      }
      System.out.println(); // Zeilenumbruch nach jeder Zeile
    }
  }
}
