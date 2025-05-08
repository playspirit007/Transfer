package Shop;

public record FastFood(
    String name,
    FastFoodCategory fastFoodCategory,
    double calorificValueInKcal,
    boolean isVegetarian)
    implements Comparable<FastFood> {

  public double getCalorificValueInKcal() {
    return this.calorificValueInKcal;
  }

  @Override
  public int compareTo(FastFood o) {
    return Double.compare(getCalorificValueInKcal(), o.getCalorificValueInKcal());
  }
}
