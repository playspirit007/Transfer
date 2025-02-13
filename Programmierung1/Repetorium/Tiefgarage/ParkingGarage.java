package Tiefgarage;

public class ParkingGarage {

  private final ParkingSpot[] parkingSpots;

  public ParkingGarage(int numberOfParkingSpots) {
    this.parkingSpots = new ParkingSpot[numberOfParkingSpots];
    for (int i = 0; i < numberOfParkingSpots; i++) {
      this.parkingSpots[i] = new ParkingSpot(5.0, 2.0, false); // Erstelle individuelle Instanzen
    }
  }

  public String parkIn(Vehicle vehicle, int parkingSpotNumber) {
    // Prüfen, ob die Parkplatznummer gültig ist
    if (parkingSpotNumber < 0 || parkingSpotNumber >= parkingSpots.length) {
      return "Ungültige Parkplatznummer!";
    }

    ParkingSpot spot = parkingSpots[parkingSpotNumber];

    // Prüfen, ob der Parkplatz existiert
    if (spot == null) {
      return "Fehler: Parkplatz existiert nicht!";
    }

    // Prüfen, ob der Parkplatz nur für Busse ist und das Fahrzeug kein Bus ist
    if (spot.getIsForBusesOnly() && !(vehicle instanceof Bus)) {
      return "Fehler: Dies ist ein Busparkplatz!";
    }

    // Fahrzeug auf den Parkplatz setzen
    spot.setVehicle(vehicle);
    if (vehicle instanceof Bus) {
      return "Bus wurde eingeparkt!";
    } else if (vehicle instanceof Car) {
      return "Auto wurde eingeparkt!";
    }
    return null;
  }

  public String parkOut(Car car) {
    // Durchsuchen aller Parkplätze nach dem Fahrzeug
    for (int i = 0; i < parkingSpots.length; i++) {
      if (parkingSpots[i].getVehicle() == car) {
        parkingSpots[i].setVehicle(null);
        return "Erfolg: Das Fahrzeug wurde ausgeparkt!";
      }
    }
    return "Fehler: Das Fahrzeug wurde nicht in der Tiefgarage gefunden!";
  }

  public int getNextFreeParkingSpotNumber() {
    // Durchsuchen aller Parkplätze nach dem nächsten freien Platz
    for (int i = 0; i < parkingSpots.length; i++) {
      if (parkingSpots[i].getVehicle() == null) {
        return i; // Gibt die Nummer des freien Parkplatzes zurück
      }
    }
    return -1; // Falls kein freier Parkplatz gefunden wurde
  }
}
