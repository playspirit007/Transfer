package Tutorium;

public class Person {

	private int age;
	private String hairColor;
	private String name;
	


	public Person(int age, String haircolor, String name) {
		this.age = age;
		this.hairColor = haircolor;
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void sethairColor(String hairColor) {
		this.hairColor = hairColor; 
	}
	
	public String gethairColor() {
		return hairColor;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "name: " + name + ", age: " + age + ", Hair Color: " + hairColor;
	}
}