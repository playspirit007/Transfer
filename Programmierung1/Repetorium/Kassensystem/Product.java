package Kassensystem;

public class Product {

  private final int id;
  private final String description;
  private String unit;
  private double priceInEuro;

  public Product(int id, String description, String unit, double priceInEuro) {
    this.id = id;
    this.description = description;
    this.unit = unit;
    this.priceInEuro = priceInEuro;
  }

  public void setPriceInEuro(double priceInEuro) {
    this.priceInEuro = priceInEuro;
  }

  public double getPrice() {
    return this.priceInEuro;
  }
}
