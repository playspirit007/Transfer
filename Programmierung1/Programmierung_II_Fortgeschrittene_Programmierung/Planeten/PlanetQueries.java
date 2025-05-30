package Planeten;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public record PlanetQueries(List<Planet> planets) {

  public List<Planet> planetsWithMoreThanFiveMonds() {
    List<Planet> back = new ArrayList<>();
    back = planets.stream().filter(p -> p.moons() >= 5).toList();
    return back;
  }

  public OptionalDouble averageDiameterPlantes() {
    OptionalDouble back = null;
    back =
        planets.stream()
            .filter(p -> p.type().equals(Type.GAS_PLANET))
            .mapToDouble(p -> p.diameterInKm())
            .average();
    return back;
  }

  public List<Planet> sortedByMassDecreased() {
    List<Planet> back = new ArrayList<>();
    back =
        planets.stream()
            .sorted((p1, p2) -> Double.valueOf(p2.massInE24Kg()).compareTo(p1.massInE24Kg()))
            .toList();
    return back;
  }

  public boolean allPlanetsMoreThanOneMond() {
    return planets.stream().allMatch(p -> p.moons() >= 1);
  }

  public Map<Type, List<Planet>> groupingByType() {
    Map<Type, List<Planet>> back = new HashMap<>();
    back = planets.stream().collect(Collectors.groupingBy(p -> p.type()));
    return back;
  }
}
