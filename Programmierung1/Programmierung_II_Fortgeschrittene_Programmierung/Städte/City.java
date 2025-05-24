package Städte;

import java.util.List;

public record City(String name, double areaInKm2, int inhabitants, GeoLocation geoLocation, Major major, List<String> pointsOfInterest) {

}
