package algo01_BinäreSuche;

import java.util.Arrays;
import java.util.Scanner;

public class SortierAlgorithmus {

  public static void main(String[] args) {
    // Declaration
    int anzahl, von, bis;
    int[] Zahlen;
    Functions functions = new Functions();
    Scanner myScanner = new Scanner(System.in);

    System.out.print("Wie viele Zahlen möchten Sie generieren?: ");
    anzahl = myScanner.nextInt();
    Zahlen = new int[anzahl];

    von = 1;
    bis = 100;
    functions.zahlengenerator(Zahlen, anzahl, von, bis);
    Arrays.sort(Zahlen);
    functions.ausgabeArray(Zahlen);

    // Stelle der Zahl im Array
    System.out.print("Welche Zahl möchten Sie suchen? ");
    int Suche = myScanner.nextInt();
    functions.suchAlgorithmus(Zahlen, Suche);

    // Anzahl der Zahl im Array
    System.out.println(
        "Die Zahl %s gibt es %s mal.".formatted(Suche, functions.countZahlen(Zahlen, Suche)));
  }
}
