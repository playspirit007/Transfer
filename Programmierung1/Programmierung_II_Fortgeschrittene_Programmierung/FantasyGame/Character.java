package FantasyGame;

public record Character(
    String name, Race race, Profession profession, int level, int expierencePoints)
    implements Comparable<Character> {

  @Override
  public int compareTo(Character o) {
    if (level() != o.level) {
      return Integer.compare(o.level(), level());
    } else {
      return Integer.compare(o.expierencePoints(), expierencePoints());
    }
  }
}
