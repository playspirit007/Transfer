package Übungsaufgaben.Christbaum;

import java.util.ArrayList;

public class ChrismasTree {
	private final String type;
	private final double sizeInM;
	private final ArrayList<Candle> candles = new ArrayList<>();

	public ChrismasTree(String type, double sizeInM) {
		this.type = type;
		this.sizeInM = sizeInM;
	}

	public void addCandle(Candle candle) {
		candles.add(candle);
	}

	public void lightChristmasTree() {
		for (int i = 0; i < candles.size(); i++) {
			Candle Hilfe = candles.get(i);
			Hilfe.lightACandle();
		}
	}

	public int getNumberOfEletricCandles() {
		return ElectricCandle.numberOfElectricCandles;

	}
}
