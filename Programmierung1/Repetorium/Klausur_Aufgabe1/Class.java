package Klausur_Aufgabe1;

import java.util.ArrayList;

public class Class {

  private final String description;
  private final CourseOfStudies courseOfStudies;
  private final ArrayList<Lecture> lectures;
  private final ArrayList<Student> students;

  public Class(String description, CourseOfStudies courseOfStudies) {
    this.description = description;
    this.courseOfStudies = courseOfStudies;
    students = new ArrayList<>();
    lectures = new ArrayList<>();
  }

  public String description() {
    return this.description;
  }

  public CourseOfStudies courseOfStudies() {
    return this.courseOfStudies;
  }

  public ArrayList<Lecture> lectures() {
    return this.lectures;
  }

  public ArrayList<Student> students() {
    return this.students;
  }

  public void addLecture(Lecture lecture) {
    lectures.add(lecture);
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public Lecture getLectureWithMostCreditPoints() {
    int x = 0;
    Lecture back = null;
    for (Lecture lecture : lectures) {
      if (lecture.creditPoints() > x) {
        x = lecture.creditPoints();
        back = lecture;
      }
    }
    return back;
  }

  @Override
  public String toString() {
    return "description: "
        + this.description
        + " courseOfStudies: "
        + courseOfStudies.description()
        + " Lectues: "
        + lectures
        + " Students: "
        + students;
  }
}
