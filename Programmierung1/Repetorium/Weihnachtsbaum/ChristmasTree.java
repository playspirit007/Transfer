package Weihnachtsbaum;

import java.util.ArrayList;

public class ChristmasTree {

  private final String type;
  private final double sizeInM;
  private final ArrayList<Candle> candles;

  public ChristmasTree(String type, double sizeInM) {
    this.type = type;
    this.sizeInM = sizeInM;
    candles = new ArrayList<>();
  }

  public void addCandle(Candle candle) {
    candles.add(candle);
  }

  public void lightChristmasTree() {
    for (Candle candle : candles) {
      candle.lightACandle();
    }
  }

  public int getNumberOfElectricCandles() {
    return ElectricCandle.numberOfElectricCandles;
  }
}
