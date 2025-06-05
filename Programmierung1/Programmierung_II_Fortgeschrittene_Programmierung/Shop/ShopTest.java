package Shop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

public class ShopTest {

  private Shop shop;
  private FastFood ptest;

  @BeforeEach
  public void setUp() {
    MockitoAnnotations.openMocks(this);
    setShop(new Shop("Einkaufsladen", new HashMap<>()));
    setPtest(new FastFood("Burger", FastFoodCategory.BURGER, 550.0, false));
  }

  @Test
  public void testAddProduct() {
    shop.addProduct(ptest);
    assertEquals(shop.getAllProductsSortedByNaturalOrdering(), 1);
  }

  @Test
  public void testRateProduct() throws NoProductFoundException, InvalidRatingException {
    shop.rateProduct(ptest, 2);
  }

  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
  }

  public FastFood getPtest() {
    return ptest;
  }

  public void setPtest(FastFood ptest) {
    this.ptest = ptest;
  }
}
