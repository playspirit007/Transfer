package Shop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;

public class TestShop {
	
	@Mock private FastFood food1;
	@Mock private FastFood food2;
	@Mock private FastFood food3;
	
	@SuppressWarnings("rawtypes")
	@Mock private Shop shop;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@BeforeEach
	public void setUp() {
		food1 = new FastFood("Burger", FastFoodCategory.BURGER, 500, false);
		food2 = new FastFood("Vegeterian Burger", FastFoodCategory.BURGER, 300, true);
		food3 = new FastFood("Pizza", FastFoodCategory.PIZZA, 800, true);
		shop = new Shop("Shop", new HashMap<>());
	}
	
	@SuppressWarnings("unchecked")
	public void testAddProduct() {
		shop.addProduct(food1);
		assertTrue(shop.assortment().containsKey(food1));
	}
	
	public void testRateProduct() throws InvalidRatingException, NoProductFoundException {
		shop.addProduct(food1);
		shop.rateProduct(food1, 5);
		assertThrows(NoProductFoundException.class, () -> shop.rateProduct(food2, 4));
		assertThrows(InvalidRatingException.class, () -> shop.rateProduct(food1, 7));
	}
	
	public void testGetBestRatedProduct() throws InvalidRatingException, NoProductFoundException {
		shop.addProduct(food1);
		shop.addProduct(food2);
		shop.rateProduct(food1, 5);
		shop.rateProduct(food2, 3);
		assertEquals(shop.getBestRatedProduct(), food1);
	}
	
	public void testGetAllProductsSortedByNaturalOrdering() {
		when(food1.compareTo(food2)).thenReturn(-1);
		when(food2.compareTo(food3)).thenReturn(1);
		when(food1.compareTo(food3)).thenReturn(1);
		shop.addProduct(food1);
		shop.addProduct(food2);
		shop.addProduct(food3);
		assertEquals(3, shop.getAllProductsSortedByNaturalOrdering().size());
	}
	
}
