package JavaStreamAPI02;

import java.util.List;
import java.util.Optional;

public record FootballerQueries(List<Footballer> footballers) {
	
	public int getTotalOfAllGoalsByMidfielders() {
		return footballers.stream().filter(footballer -> footballer.position() == Position.MIDFIELDER).mapToInt(footballer -> footballer.numberOfGoals()).sum();
	}
	
	public Optional<String> getNameOfVfLWolfsburgFootballerWithMostPlayedGames() {
		String name = null;
		Footballer fmost = null;
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
		List<FootballClub> clubs = new List<>();
		
	}
}
