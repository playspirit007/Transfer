package JavaStreamAPI02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public record FootballerQueries(List<Footballer> footballers) {
	
	public int getTotalOfAllGoalsByMidfielders() {
		return footballers.stream().filter(footballer -> footballer.position() == Position.MIDFIELDER).mapToInt(footballer -> footballer.numberOfGoals()).sum();
	}
	
	public Optional<String> getNameOfVfLWolfsburgFootballerWithMostPlayedGames() {
		String name = null;
		Footballer fmost = footballers.get(0);
		for (Footballer f : footballers) {
			if (f.footballClub().name().contains("VfLWolfsburg")) {
				if (fmost.numberOfGames() < f.numberOfGames()) {
					name = f.name();
				}
			}
		}
		return Optional.ofNullable(name);
	}
	
	public List<FootballClub> getAllFootballClubs() {
		List<FootballClub> clubs = new ArrayList<>();
		for (Footballer f : footballers) {
			clubs.add(f.footballClub());
		}
		return clubs;
	}
	
	public boolean isFootballerWithSizeInCmLT170AndNumbreOfGoalsBT0() {
		boolean back = false;
		for (Footballer f : footballers) {
			if (f.numberOfGoals() >= 1 && f.sizeInCm() < 170) {
				back = true;
			}
		}
		return back;
	}
	
	public Map<Integer, List<Footballer>> getAllFootballersByBirthyear() {
		Map<Integer, List<Footballer>> back = new HashMap<>();
		for (Footballer f : footballers) {
			back.put(f.birthdate().getYear(), new ArrayList<>()).add(f);
		}
		return back;
	}
	
	public Optional<OptionalDouble> getAverageNumberOfPointsFromAllBundesligaFootballClubs() {
		return Optional.ofNullable(footballers.stream().mapToDouble(footballer -> footballer.footballClub().pointsInAllTimeTable()).average());
	}
}
