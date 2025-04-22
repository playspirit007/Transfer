package Comparators02;

public class Coordinate implements Comparable<Coordinate> {
	private int x;
	private int y;
	
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public double getDistanceToOriginPoint() {
		double ergebnis = 0;
		ergebnis = Math.sqrt(this.x * this.x + this.y * this.y);
		return ergebnis;
	}
	
	public int compareTo(Coordinate c) {
		if (getDistanceToOriginPoint() < c.getDistanceToOriginPoint()) {
		    return -1;
		  } else if (getDistanceToOriginPoint() > c.getDistanceToOriginPoint()) {
		    return 1;
		  } else {
		    return 0;
		  }
		 }
}
