package Kurs;

import java.util.ArrayList;

public class StudyCourse {

  private final String description;
  private final CourseOfStudies courseOfStudies;
  private final ArrayList<Lecture> lectures;
  private final ArrayList<Student> students;

  public StudyCourse(String description, CourseOfStudies courseOfStudies) {
    this.description = description;
    this.courseOfStudies = courseOfStudies;
    lectures = new ArrayList<>();
    students = new ArrayList<>();
  }

  public void addStudent(Student student) {
    this.students.add(student);
  }

  public void addLecture(Lecture lecture) {
    this.lectures.add(lecture);
  }

  public Lecture getLectureWithMostCreditPoints() {
    Lecture lectureWithMost = null;
    int x = 0;

    for (Lecture lecture : lectures) {
      if (lecture.getCreditPoints() > x) {
        x = lecture.getCreditPoints();
        lectureWithMost = lecture;
      }
    }
    return lectureWithMost;
  }
}
