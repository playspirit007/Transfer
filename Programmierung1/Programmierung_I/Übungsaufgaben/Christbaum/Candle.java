package Übungsaufgaben.Christbaum;

public class Candle {

	protected boolean isBuring;
	private final String color;

	public Candle(String color) {
		this.color = color;
		this.isBuring = false;
	}
	
	public void lightACandle() {
		this.isBuring = true;
	}
	
	public void turnOffACandle() {
		this.isBuring = false;
	}

	public String getColor() {
		return color;
	}

}
