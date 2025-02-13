package Würfelspiel4;

import java.util.Scanner;

public class Main {

  private static Player player1;
  private static Player player2;
  private static Scanner myScanner = new Scanner(System.in);
  private static AmountDice amountDice;
  private static FoodCategoryDice foodCategoryDice;
  private static int rounds;

  public static void main(String[] args) {
    System.out.println("Spieler 1, gib bitte Deinen Namen ein: ");
    String name1 = myScanner.nextLine();
    System.out.println("Spieler 2, gib bitte Deinen Namen ein: ");
    String name2 = myScanner.nextLine();

    player1 = new Player(name1, 100);
    player2 = new Player(name2, 100);

    amountDice = new AmountDice();
    foodCategoryDice = new FoodCategoryDice();

    rounds = 1;
    while (player1.getPoints() > 0 && player2.getPoints() > 0) {
      System.out.println(" ");
      System.out.println("Runde " + rounds);
      if (rounds == 1) {
      } else {
        System.out.println(
            "%s hat %s Punkte, %s hat %s Punkte"
                .formatted(
                    player1.getName(),
                    player1.getPoints(),
                    player2.getName(),
                    player2.getPoints()));
      }

      //      int dice1 = 0;
      //      int dice2 = 0;
      //      FoodCategory food1 = null;
      //      FoodCategory food2 = null;
      //      int ergebnis1 = 0;
      //      int ergebnis2 = 0;
      int dice1 = amountDice.rollTheDice();
      int dice2 = amountDice.rollTheDice();
      FoodCategory food1 = foodCategoryDice.rollTheDice();
      FoodCategory food2 = foodCategoryDice.rollTheDice();
      int ergebnis1 = dice1 * food1.getPoints();
      int ergebnis2 = dice2 * food2.getPoints();

      System.out.println(
          "%s würfelt %s x %s (%s Punkte)"
              .formatted(player1.getName(), dice1, food1.getDescription(), ergebnis1));
      System.out.println(
          "%s würfelt %s x %s (%s Punkte)"
              .formatted(player2.getName(), dice2, food2.getDescription(), ergebnis2));

      int a = 0;
      if (ergebnis1 > ergebnis2) {
        a = ergebnis1 - ergebnis2;
        player2.setPoints(a);
        System.out.println("%s werden %s Punkte abegezogen".formatted(player2.getName(), a));

      } else if (ergebnis2 > ergebnis1) {
        a = ergebnis2 - ergebnis1;
        player1.setPoints(a);
        System.out.println("%s werden %s Punkte abegezogen".formatted(player1.getName(), a));
      }
      rounds++;
    }
    if (player1.getPoints() > 0) {
      System.out.println("%s hat gewonnen".formatted(player1.getName()));
    } else if (player2.getPoints() > 0) {
      System.out.println("%s hat gewonnen".formatted(player2.getName()));
    }
  }
}
