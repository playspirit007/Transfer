package Liebherr.Andrey_Uebung;

public class SingletonObjekt {

  private static final SingletonObjekt instance = new SingletonObjekt();

  private int count = 0;

  private SingletonObjekt() {}

  public static SingletonObjekt getInstance() {
    return instance;
  }

  public void incCount() {
    count++;
  }

  public int getCount() {
    return count;
  }
}
