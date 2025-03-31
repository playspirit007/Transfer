package Kassensystem;

public class Item {

  private final Goods goods;
  private int amount;

  public Item(Goods goods, int amount) {
    this.goods = goods;
    this.amount = amount;
  }

  public int getAmount() {
    return this.amount;
  }

  public Goods getGoods() {
    return this.goods;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public double getSubTotalInEuro() {
    double ergebnis = 0;
    ergebnis = this.goods.getPriceInEuro() * this.amount;
    return ergebnis;
  }
}
