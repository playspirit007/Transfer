package Bibliothek;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public record Library(String name, Map<Book, Status> books) {

	public void addBook(Book book) {
		books.put(book, Status.AVAILABLE);
	}

	public Optional<Book> getBookByTitle(String title) {
		Optional<Book> back = null;
		for (Entry<Book, Status> s : books.entrySet()) {
			if (s.getKey().getTitle().equals(title)) {
				back = Optional.ofNullable(s.getKey());
			}
		}
		return back;
	}

	public List<PaperBook> getPaperBooksByStatus(Status status) {
		List<PaperBook> back = new ArrayList<>();
		for (Entry<Book, Status> s : books.entrySet()) {
			if (s.getKey().getClass().equals(PaperBook.class)) {
				if (s.getValue().equals(Status.AVAILABLE)) {
					back.add((PaperBook) s.getKey());
				}
			}
		}
		return back;
	}
}
