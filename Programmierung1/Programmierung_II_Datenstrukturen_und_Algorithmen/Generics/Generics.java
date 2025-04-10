package Generics;

public class Generics<E extends Comparable<E>> {

  private E object;
  public E obj1;
  public E obj2;

  public void setE(E object) {
    this.object = object;
  }

  public E getE() {
    return this.object;
  }

  public int compareObjects(E obj1, E obj2) {
    if (obj1 == null || obj2 == null) {
      System.out.println("Objekt darf nicht leer sein!");
    }
    return obj1.compareTo(obj2);
  }
}
