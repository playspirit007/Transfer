package Bibliothek;

public class PaperBook extends Book {

	private final int pages;

	public PaperBook(Author author, String title, int pages) {
		super(author, title);
		this.pages = pages;
	}
}
