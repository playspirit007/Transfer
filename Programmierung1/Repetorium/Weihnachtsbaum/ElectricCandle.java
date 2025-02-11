package Weihnachtsbaum;

public class ElectricCandle extends Candle {
  private boolean isBurning;
  private Object colour;
  private int powerInPercent;
  protected static int numberOfElectricCandles;

  public ElectricCandle(int powerInPercent, String colour) {
    super(colour);
    this.isBurning = false;
    this.powerInPercent = 100;
    numberOfElectricCandles++;
  }

  @Override
  public void lightACandle() {
    this.isBurning = true;
    powerInPercent -= 10;
  }

  public void recharge() {
    powerInPercent = 100;
  }
}
