package Kartenausteiler;

import java.util.ArrayList;
import java.util.Random;

public class CardDealer {

  private final ArrayList<Card> deck;
  private final Player player1;
  private final Player player2;

  public CardDealer(Player player1, Player player2) {
    this.deck = new ArrayList<>();
    this.player1 = player1;
    this.player2 = player2;
  }

  public void dealCards(int amount) {
    Random myRandom = new Random();
    int i = 0;
    while (i < amount) {
      player1.addCard(deck.get(myRandom.nextInt(0, deck.size() + 1)));
      player2.addCard(deck.get(myRandom.nextInt(0, deck.size() + 1)));
      i++;
    }
  }
}
