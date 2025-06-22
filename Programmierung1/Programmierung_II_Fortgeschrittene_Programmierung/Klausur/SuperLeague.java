package Klausur;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public record SuperLeague<T extends SuperHuman>(String name, Universe universe, Map<T, Boolean> members) {
	
	public void addSuperHuman(T t) throws WrongUniverseException {
		if (universe != t.universe()) {
			throw new WrongUniverseException();
		} else {
			members.put(t, true);
		}
	}

	
	public List<T> getAllAvailableSuperHumans() {
		List<T> back = new ArrayList<>();
		for (java.util.Map.Entry<T, Boolean> s : members.entrySet()) {
			if (s.getValue().equals(true)) {
				back.add(s.getKey());
			}
		}
		return back;
	}
	
	public Optional<T> getMostPowerfulSuperHuman() {
		Optional<T> back = null;
		for (java.util.Map.Entry<T, Boolean> s : members.entrySet()) {
			if (s.getKey().power() > back.get().power()) {
				back = Optional.ofNullable(s.getKey());
			}
		}
		return back;
	}
}
