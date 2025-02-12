package Kurs;

public class MatriculationNumber {
  private final int[] digits;

  public MatriculationNumber(
      int digit1, int digit2, int digit3, int digit4, int digit5, int digit6, int digit7) {
    digits = new int[8];
    this.digits[0] = digit1;
    this.digits[1] = digit2;
    this.digits[2] = digit3;
    this.digits[3] = digit4;
    this.digits[4] = digit5;
    this.digits[5] = digit6;
    this.digits[6] = digit7;
  }
}
