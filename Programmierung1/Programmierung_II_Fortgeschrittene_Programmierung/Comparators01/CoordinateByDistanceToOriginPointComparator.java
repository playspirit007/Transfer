package Comparators01;

import java.util.Comparator;

public class CoordinateByDistanceToOriginPointComparator implements Comparator<Coordinate> {

  @Override
  public int compare(Coordinate o1, Coordinate o2) {
    if (o1.getDistanceToOriginPoint() < o2.getDistanceToOriginPoint()) {
      return 1;
    } else if (o1.getDistanceToOriginPoint() > o2.getDistanceToOriginPoint()) {
      return -1;
    } else {
      return 0;
    }
  }
}
