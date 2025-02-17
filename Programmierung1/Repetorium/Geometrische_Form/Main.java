package Geometrische_Form;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
  public static void main(String[] args) {
    try {
      File file = new File("Repetorium/Geometrische_Form/Forms.txt");
      ShapeReader shapeReader = new ShapeReader(file);

      System.out.println("All circles:");
      for (Circle circle : shapeReader.getCircles()) {
        System.out.println("Radius: " + circle.getAreaInCm2());
      }

      System.out.println("Shapes with minimum area of 10 cm²:");
      for (Shape shape : shapeReader.getShapesWithMinArea(10)) {
        System.out.println("Area: " + shape.getAreaInCm2());
      }
    } catch (FileNotFoundException e) {
      System.err.println("File not found: " + e.getMessage());
    }
  }
}
