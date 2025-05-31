package Stellenangebot;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Person {

  private final String name;
  private final long birthdateTimeStamp;
}
