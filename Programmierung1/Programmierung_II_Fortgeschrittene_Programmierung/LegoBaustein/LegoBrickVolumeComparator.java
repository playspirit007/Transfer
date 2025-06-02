package LegoBaustein;

import java.util.Comparator;

public class LegoBrickVolumeComparator implements Comparator<LegoBrick> {

	public int compare(LegoBrick legoBrick1, LegoBrick legoBrick2) {
//		return Double.valueOf(legoBrick1.getVolume()).compareTo(Double.valueOf(legoBrick2.getVolume()));
		return Integer.compare(legoBrick1.getVolume(), legoBrick2.getVolume());
	}
}
