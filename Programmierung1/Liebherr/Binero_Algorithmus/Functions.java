package Binero_Algorithmus;

public class Functions {

  // Überprüft, ob eine Zahl in einer Zeile gültig ist
  public boolean ZahlInReihe(char[][] Binero, int row, char num) {
    int count = 0;
    for (int col = 0; col < Binero[row].length; col++) {
      if (Binero[row][col] == num) {
        count++;
      }
    }
    return count < 5; // Es dürfen nur maximal 5 "0" oder "1" in einer Zeile sein
  }

  // Überprüft, ob eine Zahl in einer Spalte gültig ist
  public boolean ZahlInSpalte(char[][] Binero, int col, char num) {
    int count = 0;
    for (int row = 0; row < Binero.length; row++) {
      if (Binero[row][col] == num) {
        count++;
      }
    }
    return count < 4; // Es dürfen nur maximal 4 "0" oder "1" in einer Spalte sein
  }

  // Überprüft, ob in einer Zeile oder Spalte nicht mehr als zwei gleiche Ziffern nebeneinander
  // stehen
  public boolean ZahlNebenAn(char[][] Binero, int row, int col, char num) {
    // Zeilenprüfung
    if (col > 1 && Binero[row][col - 1] == num && Binero[row][col - 2] == num) {
      return false;
    }
    // Spaltenprüfung
    if (row > 1 && Binero[row - 1][col] == num && Binero[row - 2][col] == num) {
      return false;
    }
    return true;
  }

  // Diese Methode füllt das Binero-Gitter unter Berücksichtigung der Regeln
  public boolean lösenBinero(char[][] Binero) {
    for (int row = 0; row < Binero.length; row++) {
      for (int col = 0; col < Binero[row].length; col++) {
        // Wenn das Feld leer ist
        if (Binero[row][col] == '\u0000') {
          // Versuche mit "0"
          if (ZahlInReihe(Binero, row, '0')
              && ZahlInSpalte(Binero, col, '0')
              && ZahlNebenAn(Binero, row, col, '0')) {
            Binero[row][col] = '0';
            if (lösenBinero(Binero)) {
              return true;
            }
            Binero[row][col] = '\u0000'; // Zurücksetzen, falls es keine Lösung gab
          }

          // Versuche mit "1"
          if (ZahlInReihe(Binero, row, '1')
              && ZahlInSpalte(Binero, col, '1')
              && ZahlNebenAn(Binero, row, col, '1')) {
            Binero[row][col] = '1';
            if (lösenBinero(Binero)) {
              return true;
            }
            Binero[row][col] = '\u0000'; // Zurücksetzen, falls es keine Lösung gab
          }
          return false; // Falls weder "0" noch "1" passt
        }
      }
    }
    return true; // Rückgabe true, wenn das gesamte Gitter ausgefüllt ist
  }

  public char[][] BineroMatrix() {
    int Zeilen = 8;
    int Laenge = 10;
    char[][] Binero = new char[Zeilen][Laenge];

    char char0 = '0';
    char char1 = '1';

    // Zeile 1
    Binero[0][4] = char1;
    Binero[0][5] = char1;
    // Zeile 2
    Binero[1][0] = char0;
    Binero[1][5] = char1;
    Binero[1][8] = char0;
    Binero[1][9] = char0;
    // Zeile 4
    Binero[3][9] = char0;
    // Zeile 5
    Binero[4][2] = char1;
    Binero[4][5] = char0;
    Binero[4][8] = char1;
    // Zeile 6
    Binero[5][8] = char1;
    // Zeile 7
    Binero[6][1] = char0;
    Binero[6][6] = char1;
    Binero[6][9] = char0;
    // Zeile 8
    Binero[7][0] = char1;
    Binero[7][1] = char0;
    Binero[7][4] = char1;
    Binero[7][8] = char1;

    return Binero;
  }

  public void printBinero(char[][] Binero) {
    for (int zeile = 0; zeile < Binero.length; zeile++) {
      for (int spalte = 0; spalte < Binero[zeile].length; spalte++) {
        if (Binero[zeile][spalte] == '\u0000') {
          System.out.print("- "); // Falls das Feld nicht initialisiert wurde
        } else {
          System.out.print(Binero[zeile][spalte] + " ");
        }
      }
      System.out.println(); // Neue Zeile nach jeder Zeile im Grid
    }
  }
}

// Überprüft, ob alle Ziffern in der Matrix korrekt sind
//  public boolean isCompleted(char[][] Binero) {
//    for (int row = 0; row < Binero.length; row++) {
//      for (int col = 0; col < Binero[row].length; col++) {
//        if (Binero[row][col] == '\u0000') {
//          return false; // Es gibt noch leere Felder
//        }
//      }
//    }
//    return true; // Alle Felder sind gefüllt
//  }
