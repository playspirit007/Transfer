package Würfelspiel4;

import java.util.Random;

public class FoodCategoryDice {

  public FoodCategory rollTheDice() {
    var myRandom = new Random();
    FoodCategory[] categories = FoodCategory.values();
    int index = myRandom.nextInt(categories.length);

    return categories[index];
  }
}

//
//  public FoodCategory rollTheDice() {
//    Random myRandom = new Random();
//    int x = myRandom.nextInt(1, 12);
//    FoodCategory re = null;
//
//    if (x == 1) {
//      re = FoodCategory.BEVERAGES;
//    } else if (x == 2) {
//      re = FoodCategory.VEGETABLES;
//    } else if (x == 3) {
//      re = FoodCategory.FRUITS;
//    } else if (x == 4) {
//      re = FoodCategory.GRAIN_PRODUCTS;
//    } else if (x == 5) {
//      re = FoodCategory.POTATOES;
//    } else if (x == 6) {
//      re = FoodCategory.DAIRY_PRODUCTS;
//    } else if (x == 7) {
//      re = FoodCategory.MEAT;
//    } else if (x == 8) {
//      re = FoodCategory.FISH;
//    } else if (x == 9) {
//      re = FoodCategory.EGGS;
//    } else if (x == 10) {
//      re = FoodCategory.FATS_AND_OILS;
//    } else {
//      re = FoodCategory.SWEETS;
//    }
//    return re;
//  }
// }
