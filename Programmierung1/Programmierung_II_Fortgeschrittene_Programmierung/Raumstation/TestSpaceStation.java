package Raumstation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeAll;
import org.mockito.Mock;

public class TestSpaceStation {

	@Mock private SpaceFighter fighter1;
	@Mock private SpaceFighter fighter2;
	
	@Mock private SpaceStation station1;
	
	@BeforeAll
	public void setUp() {
		fighter1 = new SpaceFighter("Jet1", Type.A_WING);
		fighter2 = new SpaceFighter("Jet1", Type.TIE_FIGHTER);
		station1 = new SpaceStation("Station", new HashMap<>());
		}
	
	public void testLand() throws SpaceFighterAlreadyLandedException, BayAlreadyLoadedException {
		station1.land(1, fighter1);
		assertThrows(BayAlreadyLoadedException.class, () -> station1.land(1, fighter1));
	}
	
	public void getFastestSpaceFighter() throws SpaceFighterAlreadyLandedException, BayAlreadyLoadedException {
		station1.land(1, fighter1);
		station1.land(2, fighter2);
		assertEquals(station1.getFastestSpaceFighter(), fighter1);
	}
	
}
