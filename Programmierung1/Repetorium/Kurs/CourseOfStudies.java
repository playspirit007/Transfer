package Kurs;

public enum CourseOfStudies {
  WI("Wirtschaftsinformatik"),
  INF("Informatik"),
  BWL("BWL");

  private final String description;

  CourseOfStudies(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}
