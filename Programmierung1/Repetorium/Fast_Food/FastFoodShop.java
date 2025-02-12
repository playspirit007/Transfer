package Fast_Food;

import java.util.ArrayList;

public class FastFoodShop {

  private final String name;
  private final ArrayList<FastFood> fastFood;

  public FastFoodShop(String name) {
    this.name = name;
    fastFood = new ArrayList<>();
  }

  public void addFastFood(FastFood fastFood) {
    this.fastFood.add(fastFood);
  }

  public void rateFastFood(FastFood fastFood, int rating) {
    fastFood.addRating(rating);
  }

  public Burger getBestRatedBurger() {
    return fastFood.stream()
        .filter(f -> f instanceof Burger)
        .map(f -> (Burger) f)
        .max((b1, b2) -> Double.compare(b1.getAverageRating(), b2.getAverageRating()))
        .orElse(null);
  }
}
