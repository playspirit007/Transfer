package Sudoku_Algorithmus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Functions {

  private char[][] sudoku;
  File file = new File("Liebherr/Sudoku_Algorithmus/Sudoku.txt");

  // Methode zum Erstellen des Sudoku aus der Datei
  public char[][] createSudoku() throws FileNotFoundException {
    Scanner myScanner = new Scanner(file);
    sudoku = new char[9][9]; // 9x9 Array für Sudoku

    int zeile = 0;
    while (myScanner.hasNextLine() && zeile < 9) {
      String line = myScanner.nextLine();
      String[] values = line.split(";");

      for (int i = 0; i < 9; i++) {
        if (values[i].equals("-")) {
          sudoku[zeile][i] = '-'; // Leere Zellen mit '0' speichern
        } else {
          sudoku[zeile][i] = values[i].charAt(0); // Zeichen speichern
        }
      }
      zeile++;
    }

    myScanner.close();
    return sudoku;
  }

  // Methode zum Lösen des Sudokus mit Backtracking
  public boolean solveSudoku() {
    return solve(0, 0);
  }

  // Rekursive Backtracking-Methode
  private boolean solve(int zeile, int spalte) {
    // Wenn wir das Ende der Zeile erreicht haben, zurücksetzen und zur nächsten Zeile gehen
    if (spalte == 9) {
      spalte = 0;
      zeile++;
      if (zeile == 9) {
        return true; // Sudoku vollständig gelöst
      }
    }

    // Wenn die Zelle bereits eine Zahl enthält, überspringen
    if (sudoku[zeile][spalte] != '-') {
      return solve(zeile, spalte + 1);
    }

    // Versuche jede Zahl von 1 bis 9
    for (int num = 1; num <= 9; num++) {
      char number = (char) ('0' + num);

      // Prüfe, ob die Zahl gültig ist
      if (isValid(zeile, spalte, number)) {
        sudoku[zeile][spalte] = number;

        // Rekursiver Aufruf, um das nächste Feld zu füllen
        if (solve(zeile, spalte + 1)) {
          return true;
        }

        // Rückgängig machen (Backtracking)
        sudoku[zeile][spalte] = '-';
      }
    }

    // Wenn keine Zahl passt, zurückkehren
    return false;
  }

  // Prüft, ob eine Zahl in der aktuellen Zeile, Spalte oder im Gatter gültig ist
  private boolean isValid(int zeile, int spalte, char number) {
    return ZahlInReihe(zeile, number)
        && ZahlInSpalte(spalte, number)
        && !isNumberInGatter(zeile, spalte, number);
  }

  // Überprüft, ob die Zahl in der angegebenen Zeile bereits vorkommt
  public boolean ZahlInReihe(int zeile, char zahl) {
    for (char temp : sudoku[zeile]) {
      if (temp == zahl) {
        return false;
      }
    }
    return true;
  }

  // Überprüft, ob die Zahl in der angegebenen Spalte bereits vorkommt
  public boolean ZahlInSpalte(int spalte, char zahl) {
    for (int i = 0; i < 9; i++) {
      if (sudoku[i][spalte] == zahl) {
        return false;
      }
    }
    return true;
  }

  // Überprüft, ob die Zahl im entsprechenden 3x3-Gatter bereits vorkommt
  public boolean isNumberInGatter(int row, int col, char number) {
    int gatterStartRow = (row / 3) * 3;
    int gatterStartCol = (col / 3) * 3;

    for (int i = gatterStartRow; i < gatterStartRow + 3; i++) {
      for (int j = gatterStartCol; j < gatterStartCol + 3; j++) {
        if (sudoku[i][j] == number) {
          return true;
        }
      }
    }
    return false;
  }

  // Methode zum Ausdrucken des Sudokus
  public void printSudoku() {
    for (char[] zeile : sudoku) {
      for (char nummer : zeile) {
        System.out.print(nummer + " ");
      }
      System.out.println();
    }
  }
}
