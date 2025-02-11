package Fast_Food;

import Übungsaufgaben.Würfelspiel4.FoodCategory;

public class Food {

  private final String name;
  private final FoodCategory foodCategory;
  private final double calorificValueInKcal;

  public Food(String name, FoodCategory foodCategory, double calorificValueInKcal) {
    this.name = name;
    this.foodCategory = foodCategory;
    this.calorificValueInKcal = calorificValueInKcal;
  }

  public String getName() {
    return this.name;
  }

  public FoodCategory getFoodCategory() {
    return this.foodCategory;
  }

  public double getCalorificValueInKcal() {
    return this.calorificValueInKcal;
  }
}
