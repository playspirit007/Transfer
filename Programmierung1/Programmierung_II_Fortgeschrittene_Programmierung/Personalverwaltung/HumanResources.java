package Personalverwaltung;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public record HumanResources(Map<TelephoneNumber, Person> telephoneBook, List<Person> staff) {

	public void addTelephoneNumber(TelephoneNumber telephoneNumber, Person person) {
		telephoneBook.put(telephoneNumber, person);
	}

	public void addStaff(Person person) throws DuplicateException {
		for (Entry<TelephoneNumber, Person> s : telephoneBook.entrySet()) {
			if (s.getValue().equals(person)) {
				throw new DuplicateException();
			}
		}
		telephoneBook.put(null, person);
	}

	public List<TelephoneNumber> getTelephoneNumbersByPersonId(int id) {
		List<TelephoneNumber> back = new ArrayList<>();
		for (Entry<TelephoneNumber, Person> s : telephoneBook.entrySet()) {
			if (s.getValue().id() == id) {
				back.add(s.getKey());
			}
		}
		return back;
	}
}
