package Stellenangebot;

import java.util.ArrayList;

public class Applicant extends Person {

  private final int applicantId;
  private final ArrayList<ApplicationDocument> applicationDocuments;

  public Applicant(String name, long birthdateTimeStamp, int applicantId) {
    super(name, birthdateTimeStamp);
    this.applicantId = applicantId;
    applicationDocuments = new ArrayList<>();
  }

  public void addApplication(ApplicationDocument applicationDocument) {
    applicationDocuments.add(applicationDocument);
  }

public int getApplicantId(){return applicantId;}
}
