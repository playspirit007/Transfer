package Aufgabe5;

import org.mockito.MockitoAnnotations;

public class SuperLeagueTest {

  private SuperLeague<Hero> avengers;
  @Mock private Hero superman;
  @Mock private Hero ironman;
  @Mock private Hero spiderman;

  @BeforeEach
  public void SetUp() {
	  MockitoAnnotations.openMocks(this);
	  
	 
  }

  @Test
  public void testAddSuperHuman() {
	  when(superman.getUniverse()).thenReturn(Universe.DC);
	  assertThrows(WrongUniverseExecption.class, () -> avengers.addSuperHuman(superman))
  }

  @Test
  public void testGetAllAvailableSuperHumans() {}

  @Test
  public void testGetMostPowerfulSuperHuman() {}

  public SuperLeague<Hero> getAvengers() {
    return avengers;
  }

  public void setAvengers(SuperLeague<Hero> avengers) {
    this.avengers = avengers;
  }
}
