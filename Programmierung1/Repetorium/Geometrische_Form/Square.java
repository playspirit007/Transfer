package Geometrische_Form;

public class Square extends Shape {

  private final double aInCm;

  public Square(double aInCm) {
    this.aInCm = aInCm;
  }

  @Override
  public double getAreaInCm2() {
    return aInCm * aInCm;
  }

  @Override
  public double getCircumferenceInCm() {
    return 4 * aInCm;
  }
}
