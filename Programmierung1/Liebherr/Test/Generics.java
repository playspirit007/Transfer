package Test;

public class Generics<T, V, Z> {

  T objekt1;
  V objekt2;
  Z objekt3;

  public Generics(T objekt1, V objekt2, Z objekt3) {
    this.objekt1 = objekt1;
    this.objekt2 = objekt2;
    this.objekt3 = objekt3;
  }

  public void setT(T objekt) {
    this.objekt1 = objekt;
  }

  public void setV(V objekt) {
    this.objekt2 = objekt;
  }

  public void setZ(Z objekt) {
    this.objekt3 = objekt;
  }

  public void printAll() {
    System.out.println(objekt1);
    System.out.println(objekt2);
    System.out.println(objekt3);
  }
}
