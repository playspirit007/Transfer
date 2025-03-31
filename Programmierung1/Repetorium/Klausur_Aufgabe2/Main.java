package Klausur_Aufgabe2;

public class Main {

  private int pin;

  public void textToPin(String text) {
    pin = Integer.parseInt(text);
  }

  public boolean checkPinLength() {
    if (String.valueOf(pin).length() < 4 || String.valueOf(pin).length() > 8) {
      System.out.println("Länge der PIN ist ungültig");
      return false;
    } else {
      return true;
    }
  }

  public boolean checkPinValue() {
    return true;
  }

  public static void main(String[] args) {}
}
