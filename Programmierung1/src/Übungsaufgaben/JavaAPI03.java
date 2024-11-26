package Übungsaufgaben;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class JavaAPI03 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Gib bitte ein Datum ein (dd.mm.yyyy): ");
		String todayDate = myScanner.nextLine();
		String day = todayDate.substring(0, 2);
		String month = todayDate.substring(3, 5);
		String year = todayDate.substring(6, 10);
		
		//String in Integer konvertieren
		int day1 = Integer.parseInt(day);
		int month1 = Integer.parseInt(month);
		int year1 = Integer.parseInt(year);
		
		//Wochentag ausgeben
		LocalDate Date = LocalDate.of(year1, month1, day1);
		System.out.println("Wochentag: " + Date.getDayOfWeek());
		
		//Tage bis Weihnachten ausgeben
		LocalDate Chrismas = LocalDate.of(year1, 12, 25);
		LocalDate nowDate = LocalDate.now();
		
		// Wenn Weihnachten schon vorbei ist, nächstes Jahr nehmen
        if (Date.isAfter(Chrismas)) {
        	Chrismas = Chrismas.plusYears(1);
        }
        
		long daysBetweenChrismas = ChronoUnit.DAYS.between(Date, Chrismas);
		System.out.println("Tage bis Weihnachten: " + daysBetweenChrismas);
	}

}
