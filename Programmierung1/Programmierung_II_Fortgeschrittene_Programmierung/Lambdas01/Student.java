package Lambdas01;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Student {

	String name;
	int age;
	
	public Student(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Amelie", 20));
		students.add(new Student("Elias", 21));
		students.add(new Student("Lars", 27));
		students.add(new Student("Sebastian", 28));
		
		students.forEach(
		        new Consumer<Student>() {
		          @Override
		          public void accept(Student student) {
		            if (student.getAge() > 26) {
		              System.out.println(student.getName() + " ist " + student.getAge() + " Jahre alt");
		            }
		          }
		        });
		
		students.forEach(
				(student) -> { 
					if (student.getAge() > 26) {
					System.out.println(student.getName() + " ist " + student.getAge() + " Jahre alt");
				}
			}
		);
	}
}
