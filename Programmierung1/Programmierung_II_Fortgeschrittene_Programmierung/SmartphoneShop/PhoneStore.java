package SmartphoneShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public record PhoneStore(List<Phone> phones) {
	
	public List<Phone> query1() {
		List<Phone> back = new ArrayList<>();
		back = phones.stream()
				.filter(p -> p.brand().equals(Brand.HUAWEI))
				.filter(p -> p.numberOfCameras() >= 3)
				.sorted((p1, p2) -> Double.valueOf(p2.cpuPowerInGhz()).compareTo(p1.cpuPowerInGhz()))
				.limit(3)
				.sorted((p1, p2) -> Double.valueOf(p2.priceInEuro()).compareTo(p1.cpuPowerInGhz()))
				.toList();
		return back;
	}

	public OptionalDouble query2() {
		OptionalDouble back = null;
		back = phones.stream()
				.filter(p -> p.batteryCapacityInMah() >= 2500)
				.mapToDouble(p -> p.numberOfCameras())
				.average();
		return back;
	}
	
	public List<Phone> query3(double maxPriceInEuro) {
		List<Phone> back = new ArrayList<>();
		back = phones.stream()
				.filter(p -> p.conncetionType().isModern() == true)
				.filter(p -> p.cpuPowerInGhz() <= 2.4)
				.filter(p -> p.priceInEuro() <= maxPriceInEuro)
				.sorted((p1, p2) -> Double.valueOf(p1.priceInEuro()).compareTo(p2.priceInEuro()))
				.toList();
		return back;
	}
	
	public Map<Phone, String> query4() {
		return phones.stream().collect(Collectors.toMap(p -> p, p -> p.brand() + p.conncetionType().getDescription()));
	}
	
	   public Map<ConnectionType, List<Phone>> query5() {
		      return phones.stream().collect(Collectors.groupingBy(p -> p.conncetionType()));
		   }
}
