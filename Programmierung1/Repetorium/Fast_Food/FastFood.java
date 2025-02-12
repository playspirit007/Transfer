package Fast_Food;

import java.util.ArrayList;

public class FastFood extends Food {
  private final boolean isVegetarian;
  private final ArrayList<Integer> ratings;

  public FastFood(
      String name, FoodCategory foodCategory, double calorificValueInKcal, boolean isVegetarian) {
    super(name, foodCategory, calorificValueInKcal);
    this.isVegetarian = isVegetarian;
    this.ratings = new ArrayList<>();
  }

  public void addRating(int rating) {
    ratings.add(rating);
  }

  public double getAverageRating() {
    double average = 0;
    int i = 1;
    for (int rating : ratings) {
      average += rating;
      i++;
    }
    average = (average / i);
    return average;
  }

  @Override
  public String toString() {
    return super.toString()
        + " | Vegetarian: "
        + isVegetarian
        + " | Avg. Rating: "
        + getAverageRating();
  }
}
