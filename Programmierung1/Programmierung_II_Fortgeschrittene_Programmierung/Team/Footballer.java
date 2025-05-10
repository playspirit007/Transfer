package Team;

public class Footballer extends Sportsman {

    private int numberOfGoals;
    private int numberOfAssists;

    public Footballer(String name, int numberOfGoals, int numberOfAssists) {
        super(name);
        this.setNumberOfGoals(numberOfGoals);
        this.setNumberOfAssists(numberOfAssists);
    }

	public int getNumberOfAssists() {
		return numberOfAssists;
	}

	public void setNumberOfAssists(int numberOfAssists) {
		this.numberOfAssists = numberOfAssists;
	}

	public int getNumberOfGoals() {
		return numberOfGoals;
	}

	public void setNumberOfGoals(int numberOfGoals) {
		this.numberOfGoals = numberOfGoals;
	}

	@Override
	public int getScorerPoints() {
		return numberOfGoals * 2 + numberOfAssists;
	}
}
