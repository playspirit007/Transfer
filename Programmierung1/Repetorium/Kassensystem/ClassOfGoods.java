package Kassensystem;

public enum ClassOfGoods {
  BAKERY_PRODUCTS("Backwaren"),
  DAIRY_PRODUCTS("Milchprodukte"),
  FRUITS("Obst"),
  VEGETABLES("Gemüse");

  private final String description;

  ClassOfGoods(String description) {
    this.description = description;
  }
}
