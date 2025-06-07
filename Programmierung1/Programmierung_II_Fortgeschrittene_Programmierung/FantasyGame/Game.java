package FantasyGame;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public record Game(Map<Character, Status> characters) {

  public Status setStatus(Character character, Status status) throws InvalidStatusException {
    Status back = null;
    for (Entry<Character, Status> s : characters.entrySet()) {
      if (s.getKey().equals(character)) {
        if (s.getValue().equals(status)) {
          throw new InvalidStatusException();
        }
        back = s.getValue();
        s.setValue(status);
      }
    }
    return back;
  }

  public Optional<Character> getCharacterByStatus(Status status) {
    Optional<Character> back = null;
    for (Entry<Character, Status> s : characters.entrySet()) {
      if (s.getValue().equals(status)) {
        back = Optional.ofNullable(s.getKey());
      }
    }
    return back;
  }
}
