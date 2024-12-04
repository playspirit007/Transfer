package Übungsaufgaben.Parkhaus;

public class ParkingGarage {
	private final ParkingSpot[] parkingSpots;

	public ParkingGarage(int numberOfParkingSpots) {
		parkingSpots = new ParkingSpot[numberOfParkingSpots];
	}

	public String parkIn(Car car, int parkingSpotNumber) {
		String Meldung;
		if (parkingSpots[parkingSpotNumber] == null) {
			parkingSpots[parkingSpotNumber] = car;
			Meldung = "Das Auto wurde erfolgreich geparkt";
		} else if (parkingSpots[parkingSpotNumber] != null) {
			Meldung = "Das Auto konnte nicht geparkt werden da dieser Parkplatz bereits besetzt ist.";
		} else if (parkingSpots[parkingSpotNumber].isForBussesOnly()) {
			Meldung = "Dieser Parkplatz ist nur für Busse.";
		} 
		return Meldung;
	}

	public String parkOut(Car car) {
		for (int i = 0; i < parkingSpots.length; i++) {
			if (parkingSpots[i].equals(car)) {
				parkingSpots[i] = null;
			}
		}
		return ("Das Auto" + car + "wurde erfolgreich ausgeparkt.");
	}
	
	public int getNextFreeParkingSpot() {
		int nextSpot = 0;
		for (int i = 0; i < parkingSpots.length; i++) {
			if (parkingSpots[i] == null) {
				nextSpot = i;
			}
		}
		return nextSpot;
	}
}