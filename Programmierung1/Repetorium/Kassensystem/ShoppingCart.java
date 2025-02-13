package Kassensystem;

import java.util.ArrayList;

public class ShoppingCart {

  private final ArrayList<Item> items;

  public ShoppingCart() {
    items = new ArrayList<>();
  }

  public void createItem(Goods goods, int amount) {
    Item item = new Item(goods, amount);
    this.items.add(item);
  }

  public double getInTotalEuro() {
    double x = 0;
    for (Item item : items) {
      x += item.getSubTotalInEuro();
    }
    return x;
  }

  public ArrayList<Item> getItems() {
    return items;
  }
}
