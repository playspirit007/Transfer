package Aufgabe5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public record SuperLeague<T>(String name, Universe universe, Map<T, Boolean> members) {

  public void addSuperHuman(T t) {
    members.put(t, null);
  }

  public List<T> getAllAvailableSuperHumas() {
    List<T> back = new ArrayList<>();
    for (Entry<T, Boolean> s : members.entrySet()) {
      if (s.getValue() == true) {
        back.add(s.getKey());
      }
    }
    return back;
  }

  public Optional<T> getMostPowerfulSuperHuman() {
    Optional<T> back = null;
    for (Entry<T, Boolean> s : members.entrySet()) {
      if (s.getValue() == true) {}
    }

    return back;
  }
}
