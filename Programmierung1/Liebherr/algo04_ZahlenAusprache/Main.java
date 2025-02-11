package algo04_ZahlenAusprache;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    String x;
    int y;
    boolean repeat = true;
    Scanner myScanner = new Scanner(System.in);
    Functions function = new Functions();

    while (repeat) {
      System.out.print("Welche Zahl soll ausgesprochen werden: ");
      x = myScanner.nextLine();
      if (x.contains("exit")) {
        repeat = false;
        break;
      }
      y = Integer.valueOf(x);
      System.out.println(function.auspracheZahl(y));
      System.out.println(" ");
    }
  }
}
