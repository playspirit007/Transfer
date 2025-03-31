package Kartenausteiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CardsReader {

  public static void main(String[] args) throws FileNotFoundException {

    File file = new File("Repetorium/Kartenausteiler/Karten.txt");
    Scanner myScanner = new Scanner(file);

    while (myScanner.hasNextLine()) {
      String line = myScanner.nextLine();
      String[] input = line.split(";");
      String colour = input[0];
      int value = Integer.parseInt(input[1]);
      Card card = new Card(colour, value);
    }
  }
}
