package Tutorium;
import Tutorium.Person;

public class Person_main {

	public static void main(String[] args) {
		Person philipp = new Person(24, "braun", "Philipp");
		Person Eva = new Person(20, "braun", "Eva");
		
		philipp.setAge(25);
		philipp.getAge();
		philipp.sethairColor("braun");
		philipp.gethairColor();
		philipp.setName("Philipp");
		
	}

}
