package repetition;

import java.util.Random;

public class wuerfel {

	public static Random random = new Random();
	
	public static int wuerfelln() {
		return random.nextInt(6) + 1;
		
	}

}
