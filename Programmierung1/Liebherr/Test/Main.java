package Test;

public class Main {

  public static void main(String[] agrs) {
    Generics<Integer, String, Double> generic1 = new Generics(21, "Name", 80.2);
    generic1.printAll();
    System.out.println(generic1.getClass());
  }
}
