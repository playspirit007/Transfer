package Videosammlung;

public class Vhs extends Video{
	
	private final boolean isRewritable;
	
	public Vhs(Movie movie, boolean isRewritable) {
		super(movie);
		this.isRewritable = isRewritable;
	}
	
	public boolean getIsRewritable() {
		return this.isRewritable;
	}
}
