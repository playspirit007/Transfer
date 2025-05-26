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
		back = tanks.stream().filter(t -> t.weightInTons() >= 25).collect(Collectors.groupingBy(t -> t.type()));
		back.forEach((t, ts) -> System.out.println(t + ": " + ts));
	}

	public OptionalDouble getAveragePerformanceInHorsePower() {
		OptionalDouble back = null;
		back = tanks.stream().mapToDouble(t -> t.performanceInHorsePower()).average();
		return back;
	}

	List<Nation> getAllNations() {
		List<Nation> back = new ArrayList<>();
		back = tanks.stream().map(t -> t.nation()).distinct().toList();
		return back;
	}

	public boolean isAllTanksMaxSpeedBE50KMH() {
		return tanks.stream().filter(t -> t.type().equals(Type.BATTLE_TANK)).allMatch(t -> t.maxSpeedInKmh() < 50);
	}

	public void printLongestTankFromGermany() {
		Optional<Tank> back = null;
		back = tanks.stream().filter(t -> t.nation().equals(Nation.GER))
				.max((p1, p2) -> Double.valueOf(p2.lengthInMeters()).compareTo(p1.lengthInMeters()));

		back.ifPresentOrElse(t -> System.out.println(t.name()), () -> System.out.println("null"));
	}
}
