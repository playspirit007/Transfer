package Shop;

public class NoProductFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public NoProductFoundException(String text){
		super(text);
	}

	
}
