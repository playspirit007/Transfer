package Übungsaufgaben.Würfelspiel2;

public enum ShapeSymbol {
	CIRCLE(0), SQUARE(4), TRIANGLE(3);
	private final int corners;
	
	public int getCorners() {
		return this.corners;
	}
	ShapeSymbol(int corners) {
		this.corners = corners;
	}
}
