package Panzer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public record TankQueries(List<Tank> tanks) {

  public void printAllTanksWithWeightBT25TonsByType() {
    Map<Type, List<Tank>> back = new HashMap<>();
    back =
        tanks.stream()
            .filter(t -> t.weightInTons() >= 25)
            .collect(Collectors.groupingBy(t -> t.type()));

    back.forEach(
        (ty, t) -> {
          System.out.println(ty + " :" + t);
        });
  }

  public OptionalDouble getAveragePerformanceInHorsePower() {
    OptionalDouble back = null;
    back = tanks.stream().mapToDouble(t -> t.performanceInHorsePower()).average();
    return back;
  }

  public List<Nation> getAllNations() {
    List<Nation> back = new ArrayList<>();
    back = tanks.stream().map(t -> t.nation()).distinct().toList();
    return back;
  }

  public boolean isAllTanksMaxSpeedBE50KMH() {
    return tanks.stream()
        .allMatch(t -> t.maxSpeedInKmh() >= 50 && t.type().equals(Type.BATTLE_TANK));
  }

  public void printLongestTankFromGermany() {
    Optional<Tank> back = null;
    back =
        tanks.stream()
            .filter(t -> t.nation().equals(Nation.GER))
            .max((t1, t2) -> Double.valueOf(t2.lengthInMeters()).compareTo(t1.lengthInMeters()));

    if (back.isEmpty()) {
      System.out.println("null");
    } else {
      System.out.println(back.get().name());
    }
  }
}
