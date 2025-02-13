package Kassensystem;

import java.util.ArrayList;

public class ShoppingCart {

  private final ArrayList<Item> items;

  public ShoppingCart() {
    items = new ArrayList<>();
  }

  public void createItem(Goods goods, int amount) {
    this.items.add(goods);
  }
}
