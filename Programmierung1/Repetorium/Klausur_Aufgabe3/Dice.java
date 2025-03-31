package Klausur_Aufgabe3;

import java.util.Random;

public class Dice {

  private int value;

  public int getValue() {
    return this.value;
  }

  public void rollTheDice() {
    Random myRandom = new Random();
    this.value = myRandom.nextInt(1, 7);
  }
}
