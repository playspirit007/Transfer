package Klausur;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class SuperLeagueTest {
	
	private SuperLeague<Hero> avengers;
	
	@Mock
	private Hero superman;
	@Mock
	private Hero spiderman;
	@Mock
	private Hero ironman;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
		avengers = new SuperLeague("Avengers", Universe.MARVEL, new HashMap<>());
		superman = new Hero("Superman", Universe.DC, 6);
		ironman = new Hero("Ironman", Universe.MARVEL, 8);
		spiderman = new Hero("Spiderman", Universe.MARVEL, 10);
		
		
	}

	public SuperLeague<Hero> getAvengers() {
		return avengers;
	}
	
	public void testAddSuperHuman() throws WrongUniverseException {
		avengers.addSuperHuman(ironman);
		when(superman.universe()).thenReturn(Universe.DC);
		assertTrue(avengers.members().containsKey(ironman));
		assertThrows(WrongUniverseException.class, () -> avengers.addSuperHuman(superman));
	}

	public void testGetAllAvailableSuperHumans() throws WrongUniverseException {
		avengers.addSuperHuman(ironman);
		avengers.addSuperHuman(spiderman);
		assertEquals(avengers.getAllAvailableSuperHumans().size(), 2);
	}
	
	public void testGetMostPowerfulSuperHuman() throws WrongUniverseException {
		avengers.addSuperHuman(ironman);
		avengers.addSuperHuman(spiderman);
		assertEquals(avengers.getMostPowerfulSuperHuman(), spiderman);
	}
}
