package Videosammlung;

public class BluRay extends Video{

	private final double capacityInGb;
	
	public BluRay(Movie movie, double capacityInGb) {
		super(movie);
		this.capacityInGb = capacityInGb;
	}

	public double getCapacityInGb() {
		return capacityInGb;
	}

}
