package Binero_Algorithmus;

public class Functions {

  public char[][] BineroMatrix() {
    int Zeilen = 10;
    int Laenge = 8;
    char[][] Binero = new char[Zeilen][Laenge];

    char char0 = 0;
    char char1 = 1;

    // Zeile 1
    Binero[4][0] = char1;
    Binero[5][0] = char1;
    // Zeile 2
    Binero[0][1] = char0;
    Binero[5][1] = char1;
    Binero[8][1] = char0;
    Binero[9][1] = char0;
    // Zeile 4
    Binero[9][3] = char0;
    // Zeile 5
    Binero[2][4] = char1;
    Binero[5][4] = char0;
    Binero[8][4] = char1;
    // Zeile 6
    Binero[8][5] = char1;
    // Zeile 7
    Binero[1][6] = char0;
    Binero[6][6] = char1;
    Binero[9][6] = char0;
    // Zeile 8
    Binero[0][7] = char1;
    Binero[1][7] = char0;
    Binero[4][7] = char1;
    Binero[8][7] = char1;

    return Binero;
  }

  public char printBinero(char[][] Binero) {
    int Zeile = 0;
    int Spalte = 0;
    while (Zeile < 10) {
      if (Binero[0][0] == '0' || Binero[0][0] == '1') {
        System.out.println("Das Feld [0][0] enthält: " + Binero[0][0]);
      } else {
        System.out.println("Das Feld [0][0] ist leer oder nicht initialisiert.");
      }
    }
    return 0;
  }
}
