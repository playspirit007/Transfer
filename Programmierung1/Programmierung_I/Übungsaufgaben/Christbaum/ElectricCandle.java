package Übungsaufgaben.Christbaum;

public class ElectricCandle extends Candle {
	private int powerInPercent = 100;
	protected static int numberOfElectricCandles;

	public ElectricCandle(String colur) {
		super(colur);
		numberOfElectricCandles++;
	}

	public void lightACandle() {
		this.isBuring = true;
		this.powerInPercent -= 10;
	}

	public void recharge() {
		this.powerInPercent = 100;
	}
	public int getNumberOfElectricCandles() {
		return numberOfElectricCandles;
	}
}