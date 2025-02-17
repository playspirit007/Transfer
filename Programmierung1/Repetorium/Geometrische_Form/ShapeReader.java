package Geometrische_Form;

import java.awt.Shape;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShapeReader {

  private ArrayList<Shape> shapes;

  public ShapeReader() throws FileNotFoundException {
    shapes = new ArrayList<>();
    File file = new File("Repetorium/Geometrische_Form/Forms.txt");
    // /Programmierung/Repetorium/Geometrische_Form/Forms.txt

    Scanner myScanner = new Scanner(file);

    int i = 0;
    while (myScanner.hasNextLine()) {
      String buffer = myScanner.nextLine();
      String[] input = buffer.split(";");
    }
  }
}
