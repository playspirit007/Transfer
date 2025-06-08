package TanteEmmaLaden;

public abstract class Product {

	
	private final String descrption;
	private final double price;
	private String currency;
	
	public Product(String description, double price, String currency) {
		this.descrption = description;
		this.price = price;
		this.setCurrency(currency);
	}

	public String getDescrption() {
		return descrption;
	}

	public double getPrice() {
		return price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
