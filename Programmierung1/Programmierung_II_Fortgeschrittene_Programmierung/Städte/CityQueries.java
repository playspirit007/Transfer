package Städte;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public record CityQueries(List<City> cities) {

	public Map<Gender, List<Major>> getAllMajorsGender() {
		Map<Gender, List<Major>> back = new HashMap<>();
		back = cities.stream()
				.map(c -> c.major())
				.collect(Collectors.groupingBy(major -> major.gender()));
		return back;
	}
	
	public List<String> getAllNamesFromCitiesInEuropeWithMoreThan1MioInhabitants() {
		List<String> back = new ArrayList<>();
		back = cities.stream()
				.filter(c -> c.inhabitants() <= 1_000_000)
				.filter(c -> c.geolocation().equals(GeoLocation.EUROPE))
				.map(c -> c.name())
				.toList();
		return back;
	}
	
	public Optional<String> getNameOfMajorByNameOfCity(String nameOfCity) {
		Optional<String> back = null;
		back = cities.stream()
				.filter(c -> c.name().contains(nameOfCity))
				.map(c-> c.major().name())
				.findAny();
		return back;
	}
	
	public double getTotalAreaInKm2OfAllCitiesWithFemaleMajors() {
		double back = 0;
		back = cities.stream()
				.filter(c -> c.major().gender().equals(Gender.FEMALE))
				.mapToDouble(c -> c.areaInKm2())
				.sum();
		return back;
	}
	
	public Optional<String> printCityWithMostPointsOfInterest() {
		Optional<City> city = cities.stream()
	            .max((c1, c2) -> Integer.compare(c1.pointsOfInterest().size(),
	                  c2.pointsOfInterest().size()));
		return Optional.ofNullable(city.get().name() + " (" + city.get().pointsOfInterest() + ")");
	}
}
