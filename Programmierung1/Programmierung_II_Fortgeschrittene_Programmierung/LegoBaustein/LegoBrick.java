package LegoBaustein;

public abstract class LegoBrick extends Lego {

	private final int[] dimensions;
	private final String color;

	public LegoBrick(int id, int[] dimensions, String color) {
		super(id);
		this.color = color;
		this.dimensions = dimensions;
	}

	public int[] getDimensions() {
		return dimensions;
	}

	public String getColor() {
		return color;
	}

	public int getVolume() {
		return dimensions[0] * dimensions[1] * dimensions[2];
	}

}
