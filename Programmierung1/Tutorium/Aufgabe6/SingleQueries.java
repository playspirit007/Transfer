package Aufgabe6;

import java.util.List;

public record SingleQueries(List<Single> singles) {
	
	public boolean isAnySingleFromChinaWithMoreThan10MillionSales() {
		return singles.stream()
				.anyMatch(s -> s.salesInMillions() > 10 && s.Artist().country().equals(Country.CHN));
	}
}
