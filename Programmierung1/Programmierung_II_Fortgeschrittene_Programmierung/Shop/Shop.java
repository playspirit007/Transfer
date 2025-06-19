package Shop;

import java.util.ArrayList;
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
	
	public void rateProduct(T product, int rating) {
		for (Entry<T, List<Integer>> s : assortment.entrySet()) {
			if (s.getKey().equals(product)) {
				s.getValue().add(rating);
			}
		}
	}
	
	public Optional<T> getBestRatedProduct() {
		Optional<T> back = null;
		int schnitt = 0;
		for (Entry<T, List<Integer>> s : assortment.entrySet()) {
			for (int i : s.getValue()) {
				schnitt += i;
			}
			schnitt = schnitt / s.getValue().size();
		}
		return back;
	}
}
