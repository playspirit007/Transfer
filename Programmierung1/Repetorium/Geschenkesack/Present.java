package Geschenkesack;

public class Present {

  private final String description;
  private final double priceInEuro;
  private final Person sender;
  private final Person recipient;

  public Present(String description, double priceInEuro, Person sender, Person recipient) {
    this.description = description;
    this.priceInEuro = priceInEuro;
    this.recipient = recipient;
    this.sender = sender;
  }

  public double getPrice() {
    return this.priceInEuro;
  }
}
