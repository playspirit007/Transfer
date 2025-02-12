package Fast_Food;

public class Burger extends FastFood {
  public Burger(String name, double calorificValueInKcal, boolean isVegetarian) {
    super(name, FoodCategory.MEAT, calorificValueInKcal, isVegetarian);
  }
}
