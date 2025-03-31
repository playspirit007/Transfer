package Kassensystem;

public class Cashier {

  private final int id;
  private final String name;

  public Cashier(String name, int id) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }
}
