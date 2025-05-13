package Raumstation;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Optional;

public record SpaceStation(String name, HashMap<Integer, SpaceFighter> bays) {

	public void land(Integer bayNumber, SpaceFighter spaceFighter)
			throws SpaceFighterAlreadyLandedException, BayAlreadyLoadedException {

		for (Entry<Integer, SpaceFighter> set : bays.entrySet()) {
			if (set.getValue().equals(spaceFighter)) {
				throw new SpaceFighterAlreadyLandedException("Sternenjäger bereits gelandet!");
			} else if (set.getKey() == bayNumber && set.getValue() != null) {
				throw new BayAlreadyLoadedException("Bucht bereits belegt!");
			}
			bays.put(bayNumber, spaceFighter);
		}
	}

	public Optional<SpaceFighter> getFastestSpaceFighter() {
		SpaceFighter fastest1 = null;
		for (Entry<Integer, SpaceFighter> set : bays.entrySet()) {
			if (set.getValue().type().getMaxSpeedInKmh() > fastest1.type().getMaxSpeedInKmh()) {
				fastest1 = set.getValue();
			}
		}
		return Optional.ofNullable(fastest1);
	}

}
