package Labyrinth_Algorithmus;
import java.util.Scanner;

public class Falkultaet {

  public static void main(String[] args) {
    // Iterativ

    System.out.print("Welche Fakultät möchten Sie berechnen?: ");
    Scanner myScanner = new Scanner(System.in);
    int Fakultaet = myScanner.nextInt();

    int produkt = 1;
    int i = 1;
    while (i <= Fakultaet) {
      produkt = produkt * i;
      i++;
    }
    System.out.println("Ergebnis Iterativ: " + produkt);

    // Rekursiv
    System.out.println("Ergebnis Rekursiv: " + fakultaet(Fakultaet));
  }

  private static int fakultaet(int n) {
    if (n <= 1) {
      return 1;
    } else {
      return fakultaet(n - 1) * n;
    }
  }
}
