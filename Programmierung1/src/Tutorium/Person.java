package Tutorium;

public class Person {

	private int age;
	private String hairColor;
	private final String name;
	


	public Person(int age, String haircolor, String name) {
		this.age = age;
		this.hairColor = haircolor;
		this.name = name;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void sethairColor(String haircolor) {
		this.hairColor = hairColor; 
	}
	
	public String gethairColor() {
		return hairColor;
	}
	public void setName(String name) {
		this.name = name;
	}
}