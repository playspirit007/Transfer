package Aktivitätsdiagramm;

import java.util.Scanner;

public class Geldautomat {

  public static void main(String[] agrs) {
    Scanner myScanner = new Scanner(System.in);
    boolean login = true;
    int Kontonummer = 1234;
    int PIN = 1234;

    while (login) {

      System.out.println("Bitte Kontonummer eingeben: ");
      int eingabeKontonummer = myScanner.nextInt();

      System.out.println("Bitte PIN eingeben: ");
      int eingabePIN = myScanner.nextInt();

      if (eingabeKontonummer == Kontonummer && eingabePIN == PIN) {
        login = false;
      } else {
        System.out.println("Logindaten sind ungültig");
      }
    }

    boolean aktivität = true;
    while (aktivität) {

      System.out.println("Bitte Auswahl treffen:");
      System.out.println("1: Kontostand anzeigen");
      System.out.println("2: Geld abheben");
      System.out.println("3: Beenden");
      int auswahl = myScanner.nextInt();

      if (auswahl == 1) {
        System.out.println("[Kontostand anzeigen]");
      } else if (auswahl == 2) {
        System.out.println("Bitte Betrag in Euro eingeben:");
        int betrag = myScanner.nextInt();
      }
    }
  }
}
