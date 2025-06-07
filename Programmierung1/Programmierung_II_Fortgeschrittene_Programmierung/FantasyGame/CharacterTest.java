package FantasyGame;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class CharacterTest {

  @Mock private Character character1;

  @Mock private Character character2;

  @Mock private Game game1;

  @BeforeEach
  public void setUp() {
    character1 = new Character("Elias", Race.HUMAN, Profession.HUNTER, 10, 40);
    character1 = new Character("Lars", Race.ORC, Profession.MAGE, 10, 35);
    game1 = new Game(new HashMap<>());
  }

  @Test
  public void testSetStatus() {
    assertTrue(character1.compareTo(character2) < 0);
    assertTrue(character2.compareTo(character1) > 0);
  }

  @Test
  public void testGame() {
    game1.characters().put(character1, Status.BLEED);
    game1.characters().put(character2, Status.DISORIENTED);
    assertEquals(Optional.ofNullable(character1), game1.getCharacterByStatus(Status.BLEED));
    assertEquals(Optional.ofNullable(character2), game1.getCharacterByStatus(Status.DISORIENTED));
  }
}
