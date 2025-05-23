package JavaStreamAPI01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
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
    Comparator<Console> lifeSpanAscending =
        (console1, console2) -> Integer.compare(console1.lifespan(), console2.lifespan());
    return consoles.stream().sorted(lifeSpanAscending).collect(Collectors.toList());
  }

  public boolean isAnyConsoleWithMoreThan150MillionSoldUnits() {
    return consoles.stream().allMatch(c -> c.soldUnitsInMillions() > 50);
  }

  public boolean isAllConsolesWithMoreThan50MillionSoldUnits() {
    return consoles.stream().allMatch(c -> c.soldUnitsInMillions() > 50_000_0000);
  }

  public long getNumberOfConsolesFromNintendo() {
    long rück = 0;
    for (Console c : consoles) {
      if (c.maker() == Maker.NINTENDO) {
        rück += c.soldUnitsInMillions();
      }
    }
    return rück;
  }

  public List<String> getSoldUnitsInMillionsPerYearFromAllOutdatedConsoles() {
    List<String> rück = new ArrayList<>();
    for (Console c : consoles) {
      if (c.lifespan() == -1) {
        System.out.println(c.toString());
        rück.add(c.title());
      }
    }
    return rück;
  }

  public Optional<Double> getAverageSoldUnitsInMillionsPerYearFromAllOutdatedConsoles() {
    double average = 0;
    int counter = 0;
    for (Console c : consoles) {
      if (c.lifespan() == -1) {
        average += c.soldUnitsInMillions();
        counter++;
      }
    }
    if (counter != 0) {
      average = average / counter;
    }
    return Optional.ofNullable(average);
  }

  public OptionalDouble getAverageSoldUnitsInMillionsPerYearFromAllOutdatedConsoles1() {
    return consoles.stream()
        .filter(c -> c.lifespan() == -1)
        .mapToDouble(Console::soldUnitsInMillions)
        .average();
  }

  public Map<Object, List<Console>> getAllConsolesByMaker() {
	  return consoles.stream().collect(Collectors.groupingBy(console -> console.maker()));
  }
  
  public Map<Maker, Double> getTotalSoldUnitsInMillionsPerMaker() {
	  Map<Maker, Double> back = new HashMap<>();
	  double makerM = 0;
	  double makerN = 0;
	  double makerS = 0;
	  
	  for (Console c : consoles) {
		  if (c.maker() == Maker.MICROSOFT) {
			  makerM += c.soldUnitsInMillions();
		  } else if (c.maker() == Maker.NINTENDO) {
			  makerN += c.soldUnitsInMillions();
		  } else {
			  makerS += c.soldUnitsInMillions();
		  }
		  
		  back.put(Maker.MICROSOFT, makerM);
		  back.put(Maker.NINTENDO, makerN);
		  back.put(Maker.SONY, makerS);
	  }
	  return back;
  }
}
