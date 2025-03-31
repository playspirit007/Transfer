package Kassensystem;

public class Product {

  private final int id;
  private final String description;
  private final String unit;
  private final double priceInEuro;

  public Product(int id, String description, String unit, double priceInEuro) {
    this.id = id;
    this.description = description;
    this.unit = unit;
    this.priceInEuro = priceInEuro;
  }

  public int getId() {
    return this.id;
  }

  public String getDescription() {
    return this.description;
  }

  public String getUnit() {
    return this.unit;
  }

  public double getPriceInEuro() {
    return this.priceInEuro;
  }
}
