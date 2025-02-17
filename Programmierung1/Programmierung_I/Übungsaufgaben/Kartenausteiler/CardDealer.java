package Übungsaufgaben.Kartenausteiler;

import java.util.ArrayList;

public class CardDealer {
	private ArrayList<Card> deck;
	private final Player player1;
	private final Player player2;
	
	public CardDealer(ArrayList<Card> deck, Player player1, Player player2) {
		this.deck = new ArrayList<>();
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public void dealCards(int amount) {
		
	}
}