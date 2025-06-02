package LegoBaustein;

public abstract class Lego {

	private final int id;

	public Lego(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}
}
