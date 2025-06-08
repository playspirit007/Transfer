package TanteEmmaLaden;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public record CornerShop(String name, Map<Goods, Integer> store) {

	public Optional<Integer> getAmountByDescription(String description) {
		Optional<Integer> back = null;
		for (Entry<Goods, Integer> s : store.entrySet()) {
			if (s.getKey().getDescrption().equals(description)) {
				back = Optional.ofNullable(s.getValue());
			}
		}
		return back;
	}
	
	public void buyGoods(Goods goods, int amount) {
		for (Entry<Goods, Integer> s : store.entrySet()) {
			if (s.getKey().equals(goods)) {
				s.setValue(amount);
			}
		}
	}
	
	public void sellGoods(Goods goods, int amount) throws OutOfStockException {
		for (Entry<Goods, Integer> s : store.entrySet()) {
			if (s.getKey().equals(goods)) {
				if ((s.getValue() - amount) >= 0) {
					s.setValue(s.getValue() - amount);
				} else {
					throw new OutOfStockException();
				}
			}
		}
	}
}
