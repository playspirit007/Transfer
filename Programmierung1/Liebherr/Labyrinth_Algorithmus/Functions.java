package Labyrinth_Algorithmus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class Functions {

  private static Scanner myScanner = new Scanner(System.in);

  public static boolean solveLabyrinth(String[][] matrix, int row, int col, Set<String> visited)
      throws InterruptedException {
    // Ziel erreicht?
    if (matrix[row][col].equals("X")) {
      matrix[row][col] = "O";
      System.out.println("Die Maus hat das Labyrinth verlassen!");
      return false;
    }

    // Position als String speichern (z. B. "2,3")
    String position = row + "," + col;

    // Prüfen, ob die Position bereits besucht wurde (Zyklus erkannt)
    if (visited.contains(position)) {
      return true;
    }

    // Position als besucht markieren
    visited.add(position);

    // Setze die Maus "O", wenn erlaubt
    if (matrix[row][col].equals(" ") || matrix[row][col].equals(".")) {
      matrix[row][col] = "O";
    } else {
      return true;
    }

    Thread.sleep(100);
    System.out.print("\033[H\033[2J"); // ANSI Clear Screen
    System.out.flush();

    int i = 1;
    while (i < 8) {
      System.out.println(" ");
      i++;
    }

    printMatrix(matrix);

    // Rekursive Aufrufe in alle Richtungen ohne doppelte if-Bedingungen
    if (row + 1 < matrix.length
        && !matrix[row + 1][col].equals("*")
        && !solveLabyrinth(matrix, row + 1, col, visited)) {
      return false;
    }

    if (col + 1 < matrix[0].length
        && !matrix[row][col + 1].equals("*")
        && !solveLabyrinth(matrix, row, col + 1, visited)) {
      return false;
    }

    if (row - 1 >= 0
        && !matrix[row - 1][col].equals("*")
        && !solveLabyrinth(matrix, row - 1, col, visited)) {
      return false;
    }

    if (col - 1 >= 0
        && !matrix[row][col - 1].equals("*")
        && !solveLabyrinth(matrix, row, col - 1, visited)) {
      return false;
    }

    // Backtracking: Position als nicht Teil des endgültigen Pfads markieren
    matrix[row][col] = ".";

    // Matrix nach dem Zurückgehen erneut anzeigen
    printMatrix(matrix);

    return true;
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
        // Wenn der Wert null ist, geben wir einen Platzhalter wie "*" aus, andernfalls das
        // Zeichen
        System.out.print((matrix[i][j] != null ? matrix[i][j] : "*"));
      }
      System.out.println(); // Zeilenumbruch nach jeder Zeile
    }
  }
}
