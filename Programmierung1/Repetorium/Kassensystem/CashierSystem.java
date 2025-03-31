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

  public void addCashier(Cashier cashier) {
    this.cashiers.add(cashier);
  }

  public void login(int id) {
    Cashier cashier1;
    for (Cashier cashier : cashiers) {
      if (cashier.getId() == id) {
        this.cashier = cashier;
      }
    }
  }

  public void createShoppingCart() {
    ShoppingCart shoppingCart = new ShoppingCart();
  }

  public void addItem(int id, int amount) {
    Goods good = null;
    ShoppingCart shoppingCart = new ShoppingCart();
    for (Goods good1 : goods) {
      if (good1.getId() == id) {
        good = good1;
      }
    }
    shoppingCart.createItem(good, amount);
  }

  public void printBon() {
    for (Item item : shoppingCart.getItems()) {
      System.out.println("Menge: %s".formatted(item.getAmount()));
      System.out.println("Preis in Summe: %s €".formatted(item.getSubTotalInEuro()));
    }
  }
}
