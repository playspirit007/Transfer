package Aufgabe4;

public enum ShapeType {
  CIRCLE(0),
  TRIANGLE(3),
  RECTANGLE(4);

  private int corner;

  ShapeType(int corner) {
    this.setCorner(corner);
  }

public int getCorner(){return corner;}

public void setCorner(int corner){this.corner = corner;}
}
