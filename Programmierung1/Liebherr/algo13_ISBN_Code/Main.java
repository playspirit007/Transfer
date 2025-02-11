package algo13_ISBN_Code;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    // Test ISBN: 3446193138

    Scanner myScanner = new Scanner(System.in);
    String code;
    System.out.println("Welche ISBN-Code möchten Sie überprüfen? (10 Zeichen)");
    System.out.print("Bitte nur Zahlen ohne Bindestriche oder Leerzeichen eingeben: ");
    code = myScanner.nextLine();

    int i = 1;
    int summe = 0;
    String kurz;
    while (i < 10) {
      kurz = code.substring(i - 1, i);
      summe += (i * Integer.parseInt(kurz));
      i++;
    }

    String Prüf = code.substring(9, 10);
    int Prüfziffer = Integer.parseInt(Prüf);
    System.out.println("Prüfziffer: " + Prüf);

    if ((summe % 11) == Prüfziffer) {
      System.out.println("Korrekte ISBN-Nummer!");
    }
  }
}
