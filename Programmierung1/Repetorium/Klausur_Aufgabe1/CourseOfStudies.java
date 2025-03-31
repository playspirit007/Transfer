package Klausur_Aufgabe1;

public enum CourseOfStudies {
  WI("Wirtschaftsinformatik"),
  INF("Informatik"),
  BWL("Betriebswirtschatslehre");
  private final String description;

  CourseOfStudies(String description) {
    this.description = description;
  }

  public String description() {
    return this.description;
  }
}
