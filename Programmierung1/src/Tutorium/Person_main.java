package Tutorium;
import Tutorium.Person;

public class Person_main {

	public static void main(String[] args) {
		Person philipp = new Person(24, "braun", "Philipp");
		Person eva = new Person(20, "braun", "Eva");
		
//		philipp.setAge(25);
//		philipp.sethairColor("braun");
//		philipp.setName("Philipp");
		System.out.println(philipp.getName());
		System.out.println(philipp.getAge());
		
		System.out.println(philipp.toString());
		System.out.println(eva.toString());
	}

}
