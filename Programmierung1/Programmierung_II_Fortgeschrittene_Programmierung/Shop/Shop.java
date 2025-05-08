package Shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public record Shop<T extends Comparable<T>>(String name, HashMap<T, ArrayList<Integer>> assortment)
    implements Comparable<T> {

  public Shop(String name) {
    this(name, new HashMap<>());
  }

  public void addProduct(T product) {
    assortment.put(product, new ArrayList<>());
  }

  public void rateProduct(T product, int rating) throws NoProductFoundException, InvalidRatingException {
	  if (product == null) {
		  throw new NoProductFoundException("Kein Produkt gefunden!");
	  } else if (rating > 5 || rating < 1) {
		  throw new InvalidRatingException("Rating ungültig: " + rating);
	  }
    assortment.computeIfAbsent(product, k -> new ArrayList<>()).add(rating);
  }
  
  public Optional<T> getBestRatedProduct() {
	    T bestProduct = null;
	    double bestAverage = 0;

	    for (T product : assortment.keySet()) {
	        ArrayList<Integer> ratings = assortment.get(product);

	        if (ratings == null || ratings.isEmpty()) {
	            continue;
	        }

	        double sum = 0;
	        for (int r : ratings) {
	            sum += r;
	        }
	        double average = sum / ratings.size();

	        if (average > bestAverage) {
	            bestAverage = average;
	            bestProduct = product;
	        }
	    }

	    return Optional.ofNullable(bestProduct);
	}
  
 public List<T> getAllProductsSortedByNaturalOrdering() {
	 
	 return null;
 }
  @Override
  public int compareTo(T o) {
	  return 0;
  }
}
