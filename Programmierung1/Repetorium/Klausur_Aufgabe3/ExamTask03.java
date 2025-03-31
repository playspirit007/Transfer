package Klausur_Aufgabe3;

import java.util.Scanner;

public class ExamTask03 {

  private static Player player1;
  private static Player player2;
  private static Scanner scanner;

  public static void main(String[] agrs) {

    scanner = new Scanner(System.in);
    System.out.print("Bitte geben Sie den Namen des ersten Spielers ein: ");
    String name1 = scanner.nextLine();
    System.out.print("Bitte geben Sie den Namen des zweiten Spielers ein: ");
    String name2 = scanner.nextLine();

    player1 = new Player(name1);
    player2 = new Player(name2);

    while (player1.getHealthPoints() > 0 && player2.getHealthPoints() > 0) {
      System.out.println(" ");

      System.out.println(
          "%s hat %s Lebenspunkte".formatted(player1.name(), player1.getHealthPoints()));
      System.out.println(
          "%s hat %s Lebenspunkte".formatted(player2.name(), player2.getHealthPoints()));

      int eins = player1.rollTheDice();
      int zwei = player2.rollTheDice();
      System.out.println("%s würfelt eine %s".formatted(player1.name(), eins));
      System.out.println("%s würfelt eine %s".formatted(player2.name(), zwei));

      if (eins > zwei) {
        player2.reduceHealthPoints();
      } else if (eins < zwei) {
        player1.reduceHealthPoints();
      }
    }

    System.out.println(" ");
    if (player1.getHealthPoints() == 0) {
      System.out.println(player2.name() + " gewinnt");
    } else {
      System.out.println(player1.name() + " gewinnt");
    }
  }
}
