package Spielfiguren;

public record Character(String name, Race race, Profession profession, int level, int experiencePoints) implements Comparable<Character> {

	@Override
	public int compareTo(Character o) {
		if (this.level == o.level) {
			return Integer.compare(this.experiencePoints, o.experiencePoints);
		} else  {
			return Integer.compare(this.level, o.level);
		}
	}

}
