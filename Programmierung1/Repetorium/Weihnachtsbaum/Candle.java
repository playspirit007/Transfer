package Weihnachtsbaum;

public class Candle {
  protected boolean isBurning;
  private final String colour;

  public Candle(String colour) {
    this.isBurning = false;
    this.colour = colour;
  }

  public void lightACandle() {
    this.isBurning = true;
  }

  public void turnOffACandle() {
    this.isBurning = false;
  }

  public boolean getCandleStatus() {
    return this.isBurning;
  }
}
