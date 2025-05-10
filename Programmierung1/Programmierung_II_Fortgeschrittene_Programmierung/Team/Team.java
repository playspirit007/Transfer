package Team;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

public record Team<T extends Sportsman>(String name, HashMap<T, Position> members) {
	
	public Team(String name) {
		this(name, new HashMap<>());
	}
	
	public void addTeamMember(T member, Position position) {
		members.put(member, position);
	}
	
	@SuppressWarnings("null")
	public Optional<T> getBestScorer() {
		ArrayList<T> ausgabe = new ArrayList<>(members.keySet());
		T player = null;
		for (T t : ausgabe) {
			if (player.getScorerPoints() < t.getScorerPoints()) {
				player = t;
			}
			  return Optional.ofNullable(player);
		}
		

		return null;
		
	}
}
