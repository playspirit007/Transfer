package Städte;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public record CityQueries(List<City> cities) {
	
	public Map<Gender, List<Major>> getAllMajorsByGender() {
		 Map<Gender, List<Major>> back = new HashMap<>();
		 back = cities.stream().map(city -> city.major()).collect(Collectors.groupingBy(major -> major.gender()));
		 return back;
	}
	
	public Optional<String> getNameOfMajorByNameOfCity(String nameOfCity) {
		Optional<String> name = null;
		name = cities.stream()
				.filter(city -> city.name().equals(nameOfCity))
				.map(city -> city.major().name())
				.findAny();
		return name;
	}
	
	public double getTotalAreaInKm2OfAllCitiesWithFemaleMajors() {
		double area = 0;
		area = cities.stream()
				.filter(city -> city.major().gender().equals(Gender.FEMALE))
				.mapToDouble(city -> city.areaInKm2()).sum();
		return area;
	}

}
