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
}
