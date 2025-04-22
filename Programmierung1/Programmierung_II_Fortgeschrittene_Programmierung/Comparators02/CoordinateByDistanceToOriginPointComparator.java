package Comparators02;

public class CoordinateByDistanceToOriginPointComparator implements Comparable<Coordinate> {
 
	public int compareTo(Coordinate o1, Coordinate o2) {
		if (o1.getDistanceToOriginPoint() > o2.getDistanceToOriginPoint()) {
			return 1;
		} else if (o1.getDistanceToOriginPoint() < o2.getDistanceToOriginPoint()) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public int compareTo(Coordinate o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
