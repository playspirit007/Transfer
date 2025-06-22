package Klausur;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public record SingleQueries(List<Single> singles) {
	
	public void printAllSinglesWithMoreThan25MillionSalesPerCountry() {
		Map<Country, List<Single>> back = new HashMap<>();
		back = singles.stream()
				.filter(s -> s.salesInMillion() > 25)
				.collect(Collectors.groupingBy(s -> s.artist().country()));
		
		for (Entry<Country, List<Single>> s : back.entrySet()) {
			System.out.println(s.getKey() + " " + s.getValue());
		}
	}
	
	public void printAverageBirthYearOfAllDeceasedArtists() {
		OptionalDouble age = null;
		age = singles.stream()
				.filter(s -> s.artist().isAlive() == false)
				.mapToDouble(s -> s.artist().birthdate().getYear())
				.average();
		System.out.println(age);
	}
	
	public boolean isAnySingleFromChinaWithMoreThan10MillionSales() {
		return singles.stream().anyMatch(s -> s.artist().country().equals(Country.CHN) 
				&& s.salesInMillion() > 10);
	}
	
	public List<Single> getAllSinglesFromEdSheeran() {
		List<Single> back = new ArrayList<>();
		back = singles.stream()
				.filter(s -> s.artist().name().equals("EdSheeran"))
				.filter(s -> s.artist().isAlive() == true)
				.filter(s -> s.artist().country().equals(Country.GBR))
				.filter(s -> s.artist().birthdate().equals(LocalDate.of(1991, 2, 17)))
				.toList();
		return back;
	}
}
