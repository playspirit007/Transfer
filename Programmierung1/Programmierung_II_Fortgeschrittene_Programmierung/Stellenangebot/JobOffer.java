package Stellenangebot;

import java.util.List;

public record JobOffer(int id, String title, Recruiter recruiter, List<Applicant> applicants) {}
