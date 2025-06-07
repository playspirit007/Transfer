package Aufgabe5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class SuperLeagueTest {

  private SuperLeague<Hero> avengers;
  @Mock private Hero superman;
  @Mock private Hero ironman;
  @Mock private Hero spiderman;

  @SuppressWarnings({"unchecked", "rawtypes"})
  @BeforeEach
  public void SetUp() {
    MockitoAnnotations.openMocks(this);
    avengers = new SuperLeague("Avengers", Universe.MARVEL, new HashMap<>());
    avengers.members().put(ironman, true);
    avengers.members().put(spiderman, false);
  }

  @Test
  public void testAddSuperHuman() {
    when(superman.getUniverse()).thenReturn(Universe.DC);
    assertThrows(WrongUniverseExecption.class, () -> avengers.addSuperHuman(superman));
  }

  @Test
  public void testGetAllAvailableSuperHumans() {
    List<Hero> heroes = avengers.getAllAvailableSuperHumas();
    assertEquals(1, heroes.size());
  }

  @Test
  public void testGetMostPowerfulSuperHuman() {
    when(ironman.getPower()).thenReturn(7);
    when(superman.getPower()).thenReturn(8);
    assertEquals(Optional.of(spiderman), avengers.getMostPowerfulSuperHuman());
  }

  public SuperLeague<Hero> getAvengers() {
    return avengers;
  }

  public void setAvengers(SuperLeague<Hero> avengers) {
    this.avengers = avengers;
  }
}
