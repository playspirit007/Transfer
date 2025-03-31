package Klausur_Aufgabe1;

public class Main {

  public static void main(String[] args) {
    Student student1 = new Student("1", "Elias");
    Student student2 = new Student("2", "Lars");
    Lecture lecture1 = new Lecture("Mathe", 5);
    Lecture lecture2 = new Lecture("BWL", 7);
    Class class1 = new Class("WWIBE224", CourseOfStudies.WI);

    class1.addLecture(lecture1);
    class1.addLecture(lecture2);
    class1.addStudent(student1);
    class1.addStudent(student2);
    System.out.println(class1.toString());
    System.out.println(class1.getLectureWithMostCreditPoints());
  }
}
