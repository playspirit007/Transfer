package Kassensystem;

import java.util.ArrayList;

public class CashierSystem {

  private final String name;
  private final ArrayList<Goods> goods;
  private final ArrayList<Cashier> cashiers;
  private ShoppingCart shoppingCart;
  private Cashier cashier;

  public CashierSystem(String name) {
    this.name = name;
    goods = new ArrayList<>();
    cashiers = new ArrayList<>();
  }

  public void addGoods(Goods goods) {
    this.goods.add(goods);
  }

  public void addCashiers(Cashier cashiers) {
    this.cashiers.add(cashiers);
  }

  public void login(int id) {
    for (Cashier cashier : cashiers) {
      if (cashier.getId() == id) {
        this.cashier = cashier;
      }
    }
  }

  public void createShoppingCart() {
    shoppingCart = new ShoppingCart();
  }

  public void addItem(int id, int amount) {
    Goods foundGoods = goods.stream().filter(g -> g.getId() == id).findFirst().orElse(null);
    if (foundGoods != null) {
      shoppingCart.createItem(foundGoods, amount);
    }
  }

  public void printBon() {
    for (Item items : shoppingCart.getItems()) {
      System.out.println(items);
      items.toString();
      this.shoppingCart.getInTotalEuro();
    }
  }
}
