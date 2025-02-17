package Geometrische_Form;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class ShapeReader {
  private final List<Shape> shapes = new ArrayList<>();

  public ShapeReader(File file) throws FileNotFoundException {
    Scanner scanner = new Scanner(file);
    while (scanner.hasNextLine()) {
      String[] parts = scanner.nextLine().split(";");
      String type = parts[0].trim();

      try {
        if (type.equalsIgnoreCase("Circle")) {
          double r = Double.parseDouble(parts[1].trim());
          shapes.add(new Circle(r));
        } else if (type.equalsIgnoreCase("Rectangle")) {
          double a = Double.parseDouble(parts[1].trim());
          double b = Double.parseDouble(parts[2].trim());
          shapes.add(new Rectangle(a, b));
        } else if (type.equalsIgnoreCase("Square")) {
          double a = Double.parseDouble(parts[1].trim());
          shapes.add(new Square(a));
        }
      } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
        System.err.println("Fehler beim Parsen der Zeile: " + Arrays.toString(parts));
      }
    }
    scanner.close();
  }

  public List<Circle> getCircles() {
    List<Circle> circles = new ArrayList<>();
    for (Shape shape : shapes) {
      if (shape instanceof Circle) {
        circles.add((Circle) shape);
      }
    }
    return circles;
  }

  public List<Shape> getShapesWithMinArea(double minAreaInCm2) {
    List<Shape> filteredShapes = new ArrayList<>();
    for (Shape shape : shapes) {
      if (shape.getAreaInCm2() >= minAreaInCm2) {
        filteredShapes.add(shape);
      }
    }
    return filteredShapes;
  }
}
