package TanteEmmaLaden;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class TestCornerShop {

	
	@Mock private Goods Brot;
	@Mock private Goods Butter;
	@Mock private Goods Melone;
	@Mock private CornerShop shop1;
	
	@BeforeEach
	public void setUp() {
		Brot = new Goods("Brot", 2.0, "Euro", ClassOfGoods.BAKERY_PRODUCTS, "KG");
		Butter = new Goods("Butter", 4.0, "Euro", ClassOfGoods.DAIRY_PRODUCTS, "KG");
		Melone = new Goods("Wassermelone", 1.5, "Euro", ClassOfGoods.FRUITS, "KG");
		shop1.store().put(Brot, 10);
		shop1.store().put(Butter, 4);
		shop1.store().put(Melone, 7);
		
		shop1 = new CornerShop("Tante Emma Laden", new HashMap<>());
	}
	
	@Test
	public void testBuyGoods() {
		shop1.buyGoods(Brot, 5);
		assertEquals(shop1.store().get(Brot), 5);
		shop1.buyGoods(Melone, 6);
		assertEquals(shop1.store().get(Melone), 1);
	}
	
	@Test 
	public void getAmountByDescriptiontestGetAmountByDescription() {
		assertEquals(shop1.getAmountByDescription("Brot"), 10);
		assertEquals(Optional.empty(), shop1.getAmountByDescription("Eier"));
	}
	
	@Test
	public void testSellGoods() throws OutOfStockException {
		shop1.sellGoods(Brot, 2);
		assertEquals(8, shop1.store().get(Brot));
		assertThrows(OutOfStockException.class, () -> shop1.sellGoods(Brot, 9));
		}
}
