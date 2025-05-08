package Shop;

import java.util.ArrayList;

public class Shop_ex5 {

  public static void main(String[] agrs) {

    ArrayList<FastFood> fastFood = new ArrayList<>();

    FastFood fastfood1 = new FastFood("Hamburger", FastFoodCategory.BURGER, 800, false);
    FastFood fastfood2 = new FastFood("Pommes", FastFoodCategory.FRIES, 600, true);
    FastFood fastfood3 = new FastFood("Veggie Burger", FastFoodCategory.BURGER, 500, true);

    fastFood.add(fastfood3);
    fastFood.add(fastfood1);
    fastFood.add(fastfood2);
  }
}
