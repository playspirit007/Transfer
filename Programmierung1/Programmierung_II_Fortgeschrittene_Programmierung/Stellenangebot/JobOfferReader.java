package Stellenangebot;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JobOfferReader {

  public static List<JobOffer> getJobOffers(File file) throws FileNotFoundException {
    Scanner myScanner = new Scanner(file);
    List<JobOffer> offers = new ArrayList<>();
    while (myScanner.hasNextLine()) {
      String line = myScanner.nextLine();
      String[] copy = line.split(";");
      JobOffer job = new JobOffer(Integer.valueOf(copy[0]), copy[1], null, new ArrayList<>());
      offers.add(job);
    }
    myScanner.close();
    return offers;
  }
}
