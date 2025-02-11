package algo01_BinäreSuche;

import java.util.Random;

public class Functions {

  protected int countZahlen(int array[], int x) {
    int counter = 0;
    for (int value : array) {
      if (x == value) {
        counter++;
      }
    }
    return counter;
  }

  protected void suchAlgorithmus(int array[], int x) {
    int start, mitte, ende;
    start = 0;
    ende = array.length - 1;
    boolean gefunden = false;

    while (start <= ende) {
      mitte = (start + ende) / 2;
      if (array[mitte] == x) {
        System.out.println("Gefunden an Position :" + mitte);
        gefunden = true;
        break;
      }
      if (array[mitte] < x) {
        start = mitte + 1;
      } else {
        ende = mitte - 1;
      }
    }

    if (gefunden == false) {
      System.out.println("Nicht gefunden");
    }
  }

  protected Integer ausgabeArray(int array[]) {
    for (Integer value : array) {
      System.out.println(value);
      ;
    }
    return null;
  }

  protected void zahlengenerator(int array[], int anzahl, int von, int bis) {
    int i = 1;
    Random myRandom = new Random();

    while (i < anzahl) {
      array[i] = myRandom.nextInt(von, bis + 1);
      i++;
    }
  }
}
