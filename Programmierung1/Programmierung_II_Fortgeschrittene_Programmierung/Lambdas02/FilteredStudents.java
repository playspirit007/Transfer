package Lambdas02;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilteredStudents {

	private final ArrayList<Student> students;
	private final Predicate<Student> mandatoryFilter;
	
	public FilteredStudents(Predicate<Student> filter) {
		this.students = new ArrayList<>();
		this.mandatoryFilter = filter;
	}
	
	public void add(Student student) {
		if (this.mandatoryFilter.test(student)) {
			this.students.add(student);
		}
	}
	
	  public void forEach(Consumer<Student> consumer) {
		    for (Student student : students) {
		      consumer.accept(student);
		    }
		  }
}
