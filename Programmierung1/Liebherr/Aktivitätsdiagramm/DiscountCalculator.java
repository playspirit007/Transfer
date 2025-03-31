package Aktivitätsdiagramm;

import java.util.Scanner;

public class DiscountCalculator {

  public static void main(String[] agrs) {

    Scanner myScanner = new Scanner(System.in);
    boolean exit = true;
    while (exit) {
      System.out.println("Bitte Jahresumsatz in Euro eingeben: ");
      int Umsatz = myScanner.nextInt();
      System.out.println("Bitte Rechnungsbetrag in Euro eingeben: ");
      int Rechnungsbetrag = myScanner.nextInt();
      double Rabatt = 0;

      if (Umsatz > 1000 && Umsatz <= 5000) {
        Rabatt = 0.1;
      } else if (Umsatz > 5000) {
        Rabatt = 0.2;
      }
      double RabattierterRechnungsbetrag = Rechnungsbetrag - (Rechnungsbetrag * Rabatt);
      System.out.println("Rabattierter Rechungsbetrag: " + RabattierterRechnungsbetrag);

      System.out.println("Möchten Sie eine neue Berechnung durchführen (Ja, Nein)?");
      myScanner.next();
      String end = myScanner.nextLine();
      if (end.contains("Nein")) {
        exit = false;
      }
    }
  }
}
