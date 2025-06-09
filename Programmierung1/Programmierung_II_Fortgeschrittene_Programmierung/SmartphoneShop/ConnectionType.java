package SmartphoneShop;

public enum ConnectionType {

	USB_C("USB C", true),
	USB_MICRO("USB Micro", false),
	THUNDERBOLT("Thunderbolt", true);
	private final String description; 
	private final boolean isModern;
			
	ConnectionType(String description, boolean isModern) {
		this.description = description;
		this.isModern = isModern;
	}

	public String getDescription() {
		return description;
	}

	public boolean isModern() {
		return isModern;
	}
}
