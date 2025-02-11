package algo02_SortierAlgorithmus;

import java.util.Random;

public class Functions {

  protected Integer ausgabeArray(int array[]) {
    for (Integer value : array) {
      System.out.println(value);
      ;
    }
    return null;
  }

  protected void zahlengenerator(int array[], int anzahl) {
    int i = 1;
    Random myRandom = new Random();

    while (i < anzahl) {
      array[i] = myRandom.nextInt(1, 21);
      i++;
    }
  }

  protected void sortierAlgorithmus(int array[]) {
    int n = array.length;
    boolean swapped;
    do {
      swapped = false;
      for (int i = 0; i < n - 1; i++) {
        if (array[i] > array[i + 1]) {
          // Tauschen der Elemente
          int temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
          swapped = true;
        }
      }
    } while (swapped);
  }
}
