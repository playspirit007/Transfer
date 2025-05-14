package Einkaufsportal;

public record Product (String description, double priceInEuro) implements Sellable{
	
	public String getDescription() {
		return this.description;
	}
	
	public double gerPriceInEuro() {
		return this.priceInEuro;
	}
}
