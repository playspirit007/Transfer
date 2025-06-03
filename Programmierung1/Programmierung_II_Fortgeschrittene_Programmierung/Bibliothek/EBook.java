package Bibliothek;

public class EBook extends Book {

	private final FileFormat fileFormat;
	private final int fileSizeInKb;

	public EBook(Author author, String title, FileFormat fileFormat, int fileSizeInKb) {
		super(author, title);
		this.fileFormat = fileFormat;
		this.fileSizeInKb = fileSizeInKb;
	}
}
