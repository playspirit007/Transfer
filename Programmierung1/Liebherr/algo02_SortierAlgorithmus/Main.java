package algo02_SortierAlgorithmus;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Declaration:
    int anzahl;
    int[] Zahlen;
    Scanner myScanner = new Scanner(System.in);

    // Anzahl der Zufallszahlen
    System.out.print("Wie viele Zahlen möchten Sie generieren: ");
    anzahl = myScanner.nextInt();
    Zahlen = new int[anzahl];

    // Zahlen sortieren
    Functions function = new Functions();
    function.zahlengenerator(Zahlen, anzahl);
    function.ausgabeArray(Zahlen);

    int x = 1;
    while (x < 5) {
      x++;
      System.out.println(" ");
    }

    function.sortierAlgorithmus(Zahlen);
    function.ausgabeArray(Zahlen);
  }
}
