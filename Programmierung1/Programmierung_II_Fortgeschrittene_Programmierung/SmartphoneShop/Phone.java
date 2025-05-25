package SmartphoneShop;

public record Phone(String description, Brand brand, ConnectionType conncetionType, 
		int numberOfCameras, int batteryCapacityInMah, double cpuPowerInGhz,double priceInEuro) {
}
