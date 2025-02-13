package Fast_Food;

public class Food {

  private final String name;
  private final Fast_Food.FoodCategory foodCategory;
  private final double calorificValueInKcal;

  public Food(String name, Fast_Food.FoodCategory meat, double calorificValueInKcal) {
    this.name = name;
    this.foodCategory = meat;
    this.calorificValueInKcal = calorificValueInKcal;
  }

  public String getName() {
    return this.name;
  }

  public Fast_Food.FoodCategory getFoodCategory() {
    return this.foodCategory;
  }

  public double getCalorificValueInKcal() {
    return this.calorificValueInKcal;
  }
}
