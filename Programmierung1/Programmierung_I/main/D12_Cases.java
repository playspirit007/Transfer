package main;

import java.util.Scanner;

/**
 * Cases
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D12_Cases {

  @SuppressWarnings("resource")
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);
    char color;
    System.out.print("Gib bitte \"r/R\", \"g/G\" oder \"b/B\" ein: ");
    color = myScanner.next().charAt(0);

    String colorText;
    if (color == 'r' || color == 'R') {
      colorText = "rot";
    } else if (color == 'g' || color == 'G') {
      colorText = "grün";
    } else if (color == 'b' || color == 'B') {
      colorText = "blau";
    } else {
      colorText = "undefined";
    }
    
    System.out.println("Deine Farbe ist " + colorText);

    //klassische switch/case:
    switch (color) {
    case 'r': colorText = "rot";
    case 'b': colorText = "blau";
    case 'g': colorText = "grün";
    default: colorText = "undefined";
    }
    
    
    // Switch/Case-Ausdrücke
    colorText = switch (color) {
      case 'r', 'R' -> "rot";
      case 'g', 'G' -> "grün";
      case 'b', 'B' -> "blau";
      default -> "undefined";
    };
    System.out.println("Deine Farbe ist " + colorText);

  }

}
