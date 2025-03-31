package Kartenausteiler;

import java.util.ArrayList;

public class Player {
  private final ArrayList<Card> cards;

  public Player() {
    cards = new ArrayList<>();
  }

  public void addCard(Card card) {
    cards.add(card);
  }

  public void getCardWithHighestValue() {
    int Karo = 1;
    int Herz = 2;
    int Pik = 3;
    int card1 = 0;
    int card2 = 0;
    Card highestCard = cards.get(0);
    for (Card card : cards) {

      if (card.getColour().contains("Karo")) {
        card1 = 1;
      } else if (card.getColour().contains("Herz")) {
        card1 = 2;
      } else {
        card1 = 3;
      }

      if (highestCard.getColour().contains("Karo")) {
        card2 = 1;
      } else if (highestCard.getColour().contains("Herz")) {
        card2 = 2;
      } else {
        card2 = 3;
      }

      if (card1 > card2) {
        highestCard = card;
      } else if (card1 == card2 && card.getValue() > highestCard.getValue()) {
        highestCard = card;
      }
    }
  }

  public Card getCardsByColour(String colour) {
    for (Card card : cards) {
      if (card.getColour().contains(colour)) {
        System.out.println(card.getColour() + " " + card.getValue());
      }
    }
    return null;
  }
}
