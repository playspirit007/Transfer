package Einkaufsportal;

import java.util.ArrayList;

public class ShoppingCart<T extends Sellable> {

	public class Item {
		private final T sellable;
		private final int amount;
		
		public Item(T sellable, int amount) {
			this.sellable = sellable;
			this.amount = amount;
		}
		
		public T getSellable() {
			return sellable;
		}

		public int getAmount() {
			return amount;
		}
	}
	
	
	private final ArrayList<Item> items;
	
	public ShoppingCart() {
		items = new ArrayList<>();
	}
}