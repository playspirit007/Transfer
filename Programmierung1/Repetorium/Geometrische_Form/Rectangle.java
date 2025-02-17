package Geometrische_Form;

public class Rectangle extends Shape {

  private final double aInCm;
  private final double bInCm;

  public Rectangle(double aInCm, double bInCm) {
    this.aInCm = aInCm;
    this.bInCm = bInCm;
  }

  @Override
  public double getAreaInCm2() {
    double ergebnis = 0;
    ergebnis = this.aInCm * this.bInCm;
    return ergebnis;
  }

  @Override
  public double getCircumferenceInCm() {
    double ergebnis = 0;
    ergebnis = ((2 * this.aInCm) + (2 * this.bInCm));
    return ergebnis;
  }
}
