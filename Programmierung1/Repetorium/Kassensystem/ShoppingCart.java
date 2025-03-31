package Kassensystem;

import java.util.ArrayList;

public class ShoppingCart {

  private final ArrayList<Item> items;

  public ShoppingCart() {
    items = new ArrayList<>();
  }

  public void createItem(Goods goods, int amount) {
    Item item = new Item(goods, amount);
    getItems().add(item);
  }

  public double getTotalInEuro() {
    double ergebnis = 0;
    for (Item item : getItems()) {
      ergebnis += item.getSubTotalInEuro();
    }
    return ergebnis;
  }

public ArrayList<Item> getItems(){return items;}
}
