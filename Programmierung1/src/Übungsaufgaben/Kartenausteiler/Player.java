package Übungsaufgaben.Kartenausteiler;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private final List<Card> cards;
	
	public Player() {
	cards = new ArrayList<>();
	}
	public void addCard(Card card) {
		cards.add(card);
	}
	public Card getCardWithHihestValue() {
		
		
		Card highestCard = null;
		return highestCard;
		
	}
}
