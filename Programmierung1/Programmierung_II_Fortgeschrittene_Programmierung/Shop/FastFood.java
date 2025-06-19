package Shop;

public record FastFood(String name, FastFoodCategory fastFoodCategory, double calorific, boolean isVegetarin) implements Comparable<FastFood>{
	
	public int compareTo(FastFood otherFastFood) {
		return Double.valueOf(otherFastFood.calorific).compareTo(this.calorific);
	}


}
