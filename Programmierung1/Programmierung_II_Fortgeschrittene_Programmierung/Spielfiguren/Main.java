package Spielfiguren;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

  public static List<Character> getAvatars(int number) {
    String[] prefixes = {"Doom ", "Demon ", "Hell ", "Peace ", "Water ", "Fire "};
    String[] suffixes = {"Hammer", "Bringer", "Finder", "Walker", "Hunter"};

    List<Character> avatars = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < number; i++) {
      String name =
          prefixes[random.nextInt(prefixes.length)] + suffixes[random.nextInt(suffixes.length)];
      Race race = Race.values()[random.nextInt(Race.values().length)];
      Profession profession = Profession.values()[random.nextInt(Profession.values().length)];
      int level = random.nextInt(5, 50);
      int ex = random.nextInt(100, 1000);

      avatars.add(new Character(name, race, profession, level, ex));
    }
    return avatars;
  }

  public static void main(String[] args) {
    CharacterQueries queries = new CharacterQueries(getAvatars(25));
    Collections.sort(queries.characters());
  }
}
