package Kassensystem;

public class Cashier {

  private final int id;
  private final String name;

  public Cashier(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public int getId() {
    return this.id;
  }
}
