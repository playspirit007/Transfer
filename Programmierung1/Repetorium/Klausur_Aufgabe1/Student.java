package Klausur_Aufgabe1;

public class Student {

  private final String matriculationNumber;
  private final String name;

  public Student(String matriculationNumber, String name) {
    this.matriculationNumber = matriculationNumber;
    this.name = name;
  }

  public String matriculationNumber() {
    return this.matriculationNumber;
  }

  public String name() {
    return this.name;
  }

  @Override
  public String toString() {
    return "Matriculation Number: " + this.matriculationNumber + " Name: " + this.name;
  }
}
