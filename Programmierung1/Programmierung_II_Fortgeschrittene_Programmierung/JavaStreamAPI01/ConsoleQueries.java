package JavaStreamAPI01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public record ConsoleQueries(ArrayList<Console> consoles) {

	public ArrayList<String> getAllCurrentConsoleNames() {
		ArrayList<String> names = new ArrayList<>();
		for (Console c : consoles) {
			names.add(c.title());
		}
		return names;
	}

	public List<Console> getAllConsolesSortedByLifespan() {
		Comparator<Console> lifeSpanAscending = (console1, console2) -> Integer.compare(console1.lifespan(),
				console2.lifespan());
		return consoles.stream().sorted(lifeSpanAscending).collect(Collectors.toList());
	}

	public boolean isAnyConsoleWithMoreThan150MillionSoldUnits() {
		return consoles.stream().allMatch(c -> c.soldUnitsInMillions() > 50);
	}

	public boolean isAllConsolesWithMoreThan50MillionSoldUnits() {
		return consoles.stream().allMatch(c -> c.soldUnitsInMillions() > 50_000_0000);
	}

}
