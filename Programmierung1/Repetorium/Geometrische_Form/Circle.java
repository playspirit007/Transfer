package Geometrische_Form;

public class Circle extends Shape {

  private final double rInCm;

  public Circle(double rInCm) {
    this.rInCm = rInCm;
  }

  @Override
  public double getAreaInCm2() {
    double ergebnis = 0;
    ergebnis = Math.PI * this.rInCm * this.rInCm;
    return ergebnis;
  }

  @Override
  public double getCircumferenceInCm() {
    double ergebnis = 0;
    ergebnis = Math.PI * this.rInCm * 2;
    return ergebnis;
  }
}
