package Team;

public abstract class Sportsman implements Comparable<Sportsman> {

    private final String name;

    public Sportsman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getScorerPoints();

    @Override
    public int compareTo(Sportsman other) {
        return Integer.compare(this.getScorerPoints(), other.getScorerPoints());
    }
}
