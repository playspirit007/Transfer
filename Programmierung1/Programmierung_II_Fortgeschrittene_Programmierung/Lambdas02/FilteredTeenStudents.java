package Lambdas02;

import java.util.ArrayList;

public class FilteredTeenStudents {
	private final ArrayList<Student> students;
	
	public FilteredTeenStudents() {
		students = new ArrayList<>();
	}
	
	public void add(Student s) {
		if (s.age() < 18) {
			students.add(s);	
		}
	}
	
	public void printStudents() {
		this.students.forEach((student) -> System.out.println(student));
		}
}
