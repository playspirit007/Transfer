package Spielfiguren;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public record CharacterQueries(List<Character> characters) {

	public Optional<Character> getAnyOrcHunter() {
		Optional<Character> back = null;
		back = characters.stream().filter(c -> c.race().equals(Race.ORC)).filter(c -> c.profession().equals(Profession.HUNTER)).findAny();
		return back;
	}
	
	public long getNumberOfCharactersByName(String name) {
		long back = 0;
		back = characters.stream().
				filter(c -> c.name().equals(name))
				.count();
		return back;
	}
	
	public OptionalDouble getAverageExperiencePointsOfAllMages() {
		OptionalDouble back;
		back = characters.stream().
				filter(c -> c.profession().equals(Profession.MAGE)).
				mapToInt(c -> c.experiencePoints()).average();
		return back;
	}
	
	public List<String> getUniqueCharacterNames() {
		List<String> back = new ArrayList<>();
		back = characters.stream().map(c -> c.name()).distinct().sorted((n1, n2) -> n2.compareTo(n1)).toList();
		return back;
	}
	
	public Map<Race, List<Character>> getCharactersByRace() {
		Map<Race, List<Character>> back = new HashMap<>();
		back = characters.stream().collect(Collectors.groupingBy(c -> c.race()));
		return back;
	}
}
