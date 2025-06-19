package Shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public record Shop<T extends Comparable<T>>(String name, Map<T, List<Integer>> assortment) {

	public void addProduct(T product) {
		for (Entry<T, List<Integer>> s : assortment.entrySet()) {
			if (s.getKey().equals(product)) {
				break;
			}
		}
		assortment.put(product, new ArrayList<>());
	}
	
	public void rateProduct(T product, int rating) throws InvalidRatingException, NoProductFoundException {
		if (rating > 5 || rating < 1) {
			throw new InvalidRatingException();
		}
		if (!assortment.containsKey(product)) {
			throw new NoProductFoundException();
		}
		for (Entry<T, List<Integer>> s : assortment.entrySet()) {
			if (s.getKey().equals(product)) {
				s.getValue().add(rating);
			}
		}
	}
	
	public Optional<T> getBestRatedProduct() {
	    Optional<T> bestProduct = Optional.empty();
	    int bestAverage = Integer.MIN_VALUE;

	    for (Entry<T, List<Integer>> entry : assortment.entrySet()) {
	        List<Integer> ratings = entry.getValue();
	        if (ratings.isEmpty()) continue;

	        int sum = 0;
	        for (int rating : ratings) {
	            sum += rating;
	        }
	        int average = sum / ratings.size();

	        if (average > bestAverage) {
	            bestAverage = average;
	            bestProduct = Optional.of(entry.getKey());
	        }
	    }

	    return bestProduct;
	}
	
	public List<T> getAllProductsSortedByNaturalOrdering() {
		List<T> back1 = new ArrayList<>();
		  for (Entry<T, List<Integer>> s : assortment.entrySet()) {
			  back1.add(s.getKey());
		  }
		  Collections.sort(back1);
		return back1;
	}
}
