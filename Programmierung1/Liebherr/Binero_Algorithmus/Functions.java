package Binero_Algorithmus;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Functions {

  private Random zufall = new Random();
  private Set<String> lösungen = new HashSet<>(); // Set für gefundene Lösungen
  private final int MAX_LÖSUNGEN = 10; // Maximale Anzahl der Lösungen

  // Startmethode, um das Binero-Rätsel zu lösen
  public void lösenBinero(char[][] binero) {
    sucheLösungen(binero, 0, 0); // Starte die Lösungssuche von der ersten Zelle
    lösungenAusgeben(); // Lösungen ausgeben
  }

  // Rekursive Methode, um alle Lösungen zu suchen
  public void sucheLösungen(char[][] binero, int zeile, int spalte) {
    if (lösungen.size() >= MAX_LÖSUNGEN) {
      System.out.println("Maximale Lösungen erreicht!");
      return;
    }

    // Wenn das Ende der Matrix erreicht ist, speichern wir die Lösung
    if (zeile == binero.length) {
      lösungSpeichern(binero);
      return;
    }

    // Wenn wir das Ende der Spalte erreicht haben, gehen wir zur nächsten Zeile
    if (spalte == binero[zeile].length) {
      sucheLösungen(binero, zeile + 1, 0);
      return;
    }

    // Wenn das Feld leer ist, versuchen wir, es mit einer '0' oder '1' zu füllen
    if (binero[zeile][spalte] == '\u0000') {
      for (char zahl : new char[] {'0', '1'}) {
        if (zahlInReihe(binero, zeile, zahl)
            && zahlInSpalte(binero, spalte, zahl)
            && zahlNebenAn(binero, zeile, spalte, zahl)) {
          binero[zeile][spalte] = zahl;
          sucheLösungen(binero, zeile, spalte + 1);
          binero[zeile][spalte] = '\u0000'; // Zurücksetzen
        }
      }
    } else {
      // Wenn das Feld schon gefüllt ist, überspringen wir es
      sucheLösungen(binero, zeile, spalte + 1);
    }
  }

  // Speichert eine Lösung, wenn sie noch nicht existiert
  private void lösungSpeichern(char[][] binero) {
    String lösung = matrixAlsString(binero); // Binero-Matrix in einen String umwandeln
    if (!lösungen.contains(lösung)) {
      lösungen.add(lösung); // Nur speichern, wenn Lösung noch nicht vorhanden ist
    }
  }

  // Gibt alle gefundenen Lösungen aus
  public void lösungenAusgeben() {
    System.out.println("\nGefundene Lösungen: " + lösungen.size());
    int counter = 1;
    for (String lösung : lösungen) {
      System.out.println("\nLösung " + counter + ":");
      matrixDruckenVonString(lösung); // Lösung als Matrix ausgeben
      counter++;
    }
  }

  // Überprüft, ob die Zahl in der Reihe gültig ist
  public boolean zahlInReihe(char[][] binero, int zeile, char zahl) {
    int count0 = 0;
    int count1 = 0;
    for (char c : binero[zeile]) {
      if (c == '0') {
        count0++;
      } else if (c == '1') {
        count1++;
      }
    }

    if (zahl == '0') {
      count0++;
    } else if (zahl == '1') {
      count1++;
    }

    return (count0 <= 5 && count1 <= 5);
  }

  // Überprüft, ob die Zahl in der Spalte gültig ist
  public boolean zahlInSpalte(char[][] binero, int spalte, char zahl) {
    int count0 = 0;
    int count1 = 0;
    for (int i = 0; i < binero.length; i++) {
      char temp = binero[i][spalte];
      if (temp == '0') {
        count0++;
      } else if (temp == '1') {
        count1++;
      }
    }

    if (zahl == '0') {
      count0++;
    } else if (zahl == '1') {
      count1++;
    }

    return (count0 <= 4 && count1 <= 4);
  }

  // Prüft Felder links, rechts, darunter und darüber
  public boolean zahlNebenAn(char[][] binero, int zeile, int spalte, char zahl) {
    // Überprüfen ob links zwei gleiche Zahlen sind
    if (spalte > 1 && binero[zeile][spalte - 1] == zahl && binero[zeile][spalte - 2] == zahl) {
      return false; // Zwei gleiche Zahlen links
    }

    // Überprüfen ob rechts zwei gleiche Zahlen sind
    if (spalte < binero[zeile].length - 2
        && binero[zeile][spalte + 1] == zahl
        && binero[zeile][spalte + 2] == zahl) {
      return false; // Zwei gleiche Zahlen rechts
    }

    // Überprüfen ob oben zwei gleiche Zahlen sind
    if (zeile > 1 && binero[zeile - 1][spalte] == zahl && binero[zeile - 2][spalte] == zahl) {
      return false; // Zwei gleiche Zahlen oben
    }

    // Überprüfen ob unten zwei gleiche Zahlen sind
    if (zeile < binero.length - 2
        && binero[zeile + 1][spalte] == zahl
        && binero[zeile + 2][spalte] == zahl) {
      return false; // Zwei gleiche Zahlen unten
    }

    return true; // Keine zwei gleichen Zahlen benachbart
  }

  // Speichert die Matrix als einen String, um sie in einem Set zu speichern
  private String matrixAlsString(char[][] binero) {
    StringBuilder sb = new StringBuilder();
    for (char[] zeile : binero) {
      for (char c : zeile) {
        sb.append(c == '\u0000' ? '-' : c); // Leere Felder mit '-' darstellen
      }
    }
    return sb.toString();
  }

  // Gibt die Matrix von einem String aus
  private void matrixDruckenVonString(String lösung) {
    int index = 0;
    for (int zeile = 0; zeile < 8; zeile++) {
      for (int spalte = 0; spalte < 10; spalte++) {
        System.out.print(lösung.charAt(index++) + " ");
      }
      System.out.println();
    }
  }

  // Erzeugt die Start-Binero-Matrix mit vorgegebenen Zahlen
  public char[][] erzeugeBineroMatrix() {
    char[][] binero = new char[8][10];

    // Vorbelegte Felder
    binero[0][4] = '1';
    binero[0][5] = '1';
    binero[1][0] = '0';
    binero[1][5] = '1';
    binero[1][8] = '0';
    binero[1][9] = '0';
    binero[3][9] = '0';
    binero[4][2] = '1';
    binero[4][5] = '0';
    binero[4][8] = '1';
    binero[5][8] = '1';
    binero[6][1] = '0';
    binero[6][6] = '1';
    binero[6][9] = '0';
    binero[7][0] = '1';
    binero[7][1] = '0';
    binero[7][4] = '1';
    binero[7][8] = '1';

    return binero;
  }

  // Ausgabe Start Binero
  public void bineroDrucken(char[][] binero) {
    for (char[] zeile : binero) {
      for (char c : zeile) {
        System.out.print((c == '\u0000' ? "- " : c + " ")); // Leere Felder mit "-" anzeigen
      }
      System.out.println();
    }
  }
}
