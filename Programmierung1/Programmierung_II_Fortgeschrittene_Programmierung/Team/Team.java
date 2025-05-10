package Team;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;

public record Team<T extends Sportsman>(String name, HashMap<T, Position> members) {
	
	public Team(String name) {
		this(name, new HashMap<>());
	}
	
	public void addTeamMember(T member, Position position) {
		members.put(member, position);
	}
	
	public Optional<T> getBestScorer() {
		ArrayList<T> ausgabe = new ArrayList<>(members.keySet());
		T player = null;
		for (T t : ausgabe) {
			if (player.getScorerPoints() < t.getScorerPoints()) {
				player = t;
			}
		}
		return Optional.ofNullable(player);
	}
	
    public List<T> getAllTeamMembersByPosition(Position position) {
        List<T> result = new ArrayList<>();

        for (Entry<T, Position> entry : members.entrySet()) {
            if (entry.getValue() == position) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
