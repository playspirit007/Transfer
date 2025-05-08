package Shop;

import java.util.ArrayList;
import java.util.HashMap;

public record Shop<T extends Comparable<T>>(String name, HashMap<T, ArrayList<Integer>> assortment)
    implements Comparable<T> {

  public Shop(String name) {
    this(name, new HashMap<>());
  }

  public void addProduct(T product) {
    assortment.put(product, new ArrayList<>());
  }

  public void rateProduct(T product, int rating) {
    assortment.computeIfAbsent(product, (k) -> new ArrayList<>()).add(rating);
  }

  @Override
  public int compareTo(T o) {
    return Double.compare(1, 0);
  }
}
