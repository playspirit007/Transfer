package repetition;

public class spieler {

	public String name;
	public kaempfer kaempfer;

	
	public void Spieler(String nameValue) {
		name = nameValue;
	}
	
	public String getName() {
		return name;
	}
	
	public void setKaempfer(kaempfer kaempferValue) {
		kaempfer = kaempferValue;
	}
	public kaempfer getkaempfer() {
		return kaempfer;
	}
}
