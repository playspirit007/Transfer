package FantasyGame;

public record Character(
    String name, Race race, Profession profession, int level, int expierencePoints)
    implements Comparable<Character> {

//  @Override
//  public int compareTo(Character o) {
//    if (level() != o.level) {
//      return Integer.compare(o.level(), level());
//    } else {
//      return Integer.compare(o.expierencePoints(), expierencePoints());
//    }
//  }
	
	public int compareTo(Character other) {
		if(this.level == other.level) {
			return Double.valueOf(other.expierencePoints).compareTo(Double.valueOf(this.expierencePoints));
		} else {
			return Double.valueOf(other.level).compareTo(Double.valueOf(this.level));
		}
	}
}
