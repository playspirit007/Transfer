package Kartenspieler;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class Player {

	private final String name;
	private final List<Card> handCards;
	private final Map<Card, Integer> playedCards;
	private int actionPoints;
	
	public Player(String name, List<Card> handCards, Map<Card, Integer> playedCards) {
		this.name = name;
		this.handCards = handCards;
		this.playedCards = playedCards;
	}
	
	public String getName() {
		return this.name;
	}
	
	public List<Card> getHandCards() {
		return this.handCards;
	}
	
	public Map<Card, Integer> getPlayedCards() {
		return this.playedCards;
	}

	public int getActionPoints() {
		return actionPoints;
	}

	public void setActionPoints(int actionPoints) {
		this.actionPoints = actionPoints;
	}
	
	public void playCard(Card card, int row) throws CardNotFoundException, NotEnoughActionPointsException {
		if (!this.handCards.contains(card)) {
			throw new CardNotFoundException();
		} else {
			this.handCards.remove(row);
			this.playedCards.put(card, 1);
		}
		
		if (this.actionPoints < card.costs()) {
			throw new NotEnoughActionPointsException();
		} else {
			this.setActionPoints(this.actionPoints - card.costs());
		}
	}
	
	public Optional<Card> getMostPowerfulCardByRow(int row) {
		Optional<Card> back = null;
		for (Entry<Card, Integer> s : this.playedCards.entrySet()) {
			if (s.getValue() == row) {
				if (s.getKey().power() > back.get().power()) {
					back = Optional.ofNullable(s.getKey());
				}
			}
		return back;
		}
	}
}
