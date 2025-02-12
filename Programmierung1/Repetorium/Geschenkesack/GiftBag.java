package Geschenkesack;

import java.util.ArrayList;

public class GiftBag {

  private final ArrayList<Present> presents;

  public GiftBag() {
    presents = new ArrayList<>();
  }

  public void addPresent(Present present) {
    presents.add(present);
  }

  public Present getMostExpensivePresent() {
    double price = 0;
    Present mostExpensivePresent = null;
    for (Present present : presents) {
      if (present.getPrice() > price) {
        price = present.getPrice();
        mostExpensivePresent = present;
      }
    }
    return mostExpensivePresent;
  }
}
