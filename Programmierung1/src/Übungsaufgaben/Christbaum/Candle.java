package Übungsaufgaben.Christbaum;

public class Candle {

	protected boolean isBuring;
	private final String colour;

	public Candle(String colur) {
		this.colour = colour;
		this.isBuring = false;
	}
	
	public void lightACandle() {
		this.isBuring = true;
	}
	
	public void turnOffACandle() {
		this.isBuring = false;
	}

}
