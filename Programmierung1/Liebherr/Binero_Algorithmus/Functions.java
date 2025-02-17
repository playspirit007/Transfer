package Binero_Algorithmus;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Functions {

  private Set<List<List<Character>>> lösungen =
      new HashSet<>(); // Set für gefundene Lösungen als 2D-Array
  private Random zufall = new Random(); // Zufallsgenerator
  private final int MAX_LÖSUNGEN = 10; // Maximale Anzahl der Lösungen

  // Startmethode, um das Binero-Rätsel zu lösen
  public void lösenBinero(char[][] binero) {
    List<int[]> leereFelder = findeLeereFelder(binero); // Finde alle leeren Felder
    sucheLösungen(binero, leereFelder, 0); // Starte die Lösungssuche
    lösungenAusgeben(); // Lösungen ausgeben
  }

  // Findet alle leeren Felder (Felder mit '\u0000')
  private List<int[]> findeLeereFelder(char[][] binero) {
    List<int[]> leereFelder = new ArrayList<>();
    for (int zeile = 0; zeile < binero.length; zeile++) {
      for (int spalte = 0; spalte < binero[zeile].length; spalte++) {
        if (binero[zeile][spalte] == '\u0000') {
          leereFelder.add(new int[] {zeile, spalte});
        }
      }
    }
    return leereFelder;
  }

  // Verschiedene Lösungen suchen
  private void sucheLösungen(char[][] binero, List<int[]> leereFelder, int index) {
    if (lösungen.size() >= MAX_LÖSUNGEN) {
      return; // Abbruch nach 10 Lösungen
    }

    if (index >= leereFelder.size()) { // Wenn alle Felder gefüllt sind, Lösung speichern
      lösungSpeichern(binero);
      return;
    }

    int[] feld = leereFelder.get(index); // Aktuelles Feld
    int zeile = feld[0];
    int spalte = feld[1];

    // Zufällige Auswahl zwischen '0' und '1'
    for (int i = 0; i < 2; i++) {
      char zahl = zufall.nextBoolean() ? '0' : '1'; // Zufällige Auswahl zwischen 0 und 1

      // Überprüfen, ob die Zahl in Reihe, Spalte und benachbarten Feldern gültig ist
      if (zahlInReihe(binero, zeile, zahl)
          && zahlInSpalte(binero, spalte, zahl)
          && zahlNebenAn(binero, zeile, spalte, zahl)) {

        binero[zeile][spalte] = zahl; // Zahl setzen
        sucheLösungen(binero, leereFelder, index + 1); // Rekursiver Aufruf
        binero[zeile][spalte] = '\u0000'; // Rücksetzen der Entscheidung (Backtracking)
      }
    }
  }

  // Speichert eine Lösung, wenn sie noch nicht existiert
  private void lösungSpeichern(char[][] binero) {
    List<List<Character>> lösung = matrixAlsListe(binero); // Binero-Matrix in eine Liste umwandeln
    if (!lösungen.contains(lösung)) {
      lösungen.add(lösung); // Nur speichern, wenn Lösung noch nicht vorhanden ist
    }
  }

  // Wandelt die Binero-Matrix in eine Liste von Listen um
  private List<List<Character>> matrixAlsListe(char[][] binero) {
    List<List<Character>> liste = new ArrayList<>();
    for (char[] zeile : binero) {
      List<Character> zeilenListe = new ArrayList<>();
      for (char c : zeile) {
        zeilenListe.add(c);
      }
      liste.add(zeilenListe);
    }
    return liste;
  }

  // Gibt alle gefundenen Lösungen aus
  public void lösungenAusgeben() {
    System.out.println("\nGefundene Lösungen: " + lösungen.size());
    int counter = 1;
    for (List<List<Character>> lösung : lösungen) {
      System.out.println("\nLösung " + counter + ":");
      matrixDruckenVonListe(lösung); // Lösung als Matrix ausgeben
      counter++;
    }
  }

  // Gibt eine Matrix aus einer Liste von Listen aus
  private void matrixDruckenVonListe(List<List<Character>> lösung) {
    for (List<Character> zeile : lösung) {
      for (Character c : zeile) {
        System.out.print((c == '\u0000' ? "- " : c + " ")); // Leere Felder mit "-" anzeigen
      }
      System.out.println();
    }
  }

  // Überprüft Anzahl gleicher Zahlen in Reihe
  public boolean zahlInReihe(char[][] binero, int zeile, char zahl) {
    int count = 0;
    for (char c : binero[zeile]) {
      if (c == zahl) {
        count++;
      }
    }
    return count < 6; // Maximal 5 gleiche Zahlen in einer Reihe
  }

  // Überprüft Anzahl gleicher Zahlen in Spalte
  public boolean zahlInSpalte(char[][] binero, int spalte, char zahl) {
    int count = 0;
    for (char[] chars : binero) {
      if (chars[spalte] == zahl) {
        count++;
      }
    }
    return count < 5; // Maximal 4 gleiche Zahlen in einer Spalte
  }

  // Prüft Felder links, rechts, darunter und darüber
  public boolean zahlNebenAn(char[][] binero, int zeile, int spalte, char zahl) {
    if (spalte > 1 && binero[zeile][spalte - 1] == zahl && binero[zeile][spalte - 2] == zahl) {
      return false; // Nicht erlaubt: zwei gleiche Zahlen nebeneinander
    }
    if (spalte < binero[zeile].length - 2
        && binero[zeile][spalte + 1] == zahl
        && binero[zeile][spalte + 2] == zahl) {
      return false; // Nicht erlaubt: zwei gleiche Zahlen nebeneinander
    }
    if (zeile > 1 && binero[zeile - 1][spalte] == zahl && binero[zeile - 2][spalte] == zahl) {
      return false; // Nicht erlaubt: zwei gleiche Zahlen untereinander
    }
    if (zeile < binero.length - 2
        && binero[zeile + 1][spalte] == zahl
        && binero[zeile + 2][spalte] == zahl) {
      return false; // Nicht erlaubt: zwei gleiche Zahlen untereinander
    }
    return true;
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

  // Gibt das Binero-Rätsel aus
  public void bineroDrucken(char[][] binero) {
    for (char[] zeile : binero) {
      for (char c : zeile) {
        System.out.print((c == '\u0000' ? "- " : c + " ")); // Leere Felder mit "-" anzeigen
      }
      System.out.println();
    }
  }
}
