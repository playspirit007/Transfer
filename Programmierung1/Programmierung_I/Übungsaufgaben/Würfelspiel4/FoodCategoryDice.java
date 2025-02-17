package Übungsaufgaben.Würfelspiel4;

import java.util.Random;

public class FoodCategoryDice {
	public FoodCategory rollTheDice() {
		FoodCategory foodcategory = null;
		Random myRandom = new Random();
		int x = myRandom.nextInt(1, 12);
		if (x == 1) {
			foodcategory = FoodCategory.BEVERAGES;
		} else if (x == 2) {
			foodcategory = FoodCategory.VEGETABLES;
		} else if (x == 3) {
			foodcategory = FoodCategory.FRUITS;
		} else if (x == 4) {
			foodcategory = FoodCategory.GRAIN_PRODUCTS;
		} else if (x == 5) {
			foodcategory = FoodCategory.POTATOES;
		} else if (x == 6) {
			foodcategory = FoodCategory.DAIRY_PRODUCTS;
		} else if (x == 7) {
			foodcategory = FoodCategory.MEAT;
		}  else if (x == 8) {
			foodcategory = FoodCategory.FISH;
		}  else if (x == 9) {
			foodcategory = FoodCategory.EGGS;
		}  else if (x == 10) {
			foodcategory = FoodCategory.FATS_AND_OILS;
		} else if (x == 11) {
			foodcategory = FoodCategory.SWEETS;
		}
		return foodcategory;
	}
}
