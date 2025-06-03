package Bibliothek;

import java.util.Objects;
import java.util.UUID;

public abstract class Book {

	private final UUID id;
	private final Author author;
	private final String title;

	public Book(Author author, String title) {
		this.id = UUID.randomUUID();
		this.author = author;
		this.title = title;
	}

	public UUID getId() {
		return this.id;
	}

	public Author getAuthor() {
		return this.author;
	}

	public String getTitle() {
		return this.title;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(id, other.id)
				&& Objects.equals(title, other.title);
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, id, title);
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", title=" + title + "]";
	}
}
