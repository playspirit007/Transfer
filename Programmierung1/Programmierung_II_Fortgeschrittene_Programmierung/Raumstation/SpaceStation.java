package Raumstation;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public record SpaceStation(String name, Map<Integer, SpaceFighter> bays) {

	public void land(Integer bayNumber, SpaceFighter spaceFighter) throws SpaceFighterAlreadyLandedException, BayAlreadyLoadedException {
		for(Entry<Integer, SpaceFighter> s : bays.entrySet()) {
			if (s.getValue().equals(spaceFighter)) {
				throw new SpaceFighterAlreadyLandedException();
			}
			if (s.getKey() == bayNumber) {
				if (!s.getValue().equals(null)) {
					throw new BayAlreadyLoadedException();
				}
			}
		}
		bays.put(bayNumber, spaceFighter);
	}
	
	public Optional<SpaceFighter> getFastestSpaceFighter() {
		Optional<SpaceFighter> back = null;
		for(Entry<Integer, SpaceFighter> s : bays.entrySet()) {
			if (back.get().type().getMaxSpeedInKmh() < s.getValue().type().getMaxSpeedInKmh()) {
				back = Optional.ofNullable(s.getValue());
			}
		}
		return back;
	}
}
