package Videosammlung;

public enum Genre {
	SCIFI("Science Fiction"),
	HORROR("Horror"),
	ACTION("Action"),
	COMEDY("Komödie");
	
	private final String description;
	
	Genre(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
