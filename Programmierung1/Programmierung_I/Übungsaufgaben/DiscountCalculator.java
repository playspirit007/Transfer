package Übungsaufgaben;

import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		boolean stop = true;
		
		while (stop) {
			System.out.println("Bitte Jahresumsatz in Euro eingeben:");
			int Umsatz = myScanner.nextInt();
			System.out.println("Bitte Rechnungsbetrag in Euro eingeben:");
			int Rechnungsbetrag = myScanner.nextInt();
			
			double Rabatt = 0;
			if (Umsatz > 1000 && Umsatz <= 5000) {
				Rabatt = 10;
			} else if (Umsatz > 5000) {
				Rabatt = 20;
			} else {
				Rabatt = 0;
			}
			
			Rabatt = (Rabatt/100);
			
			double RabattEuro = Rechnungsbetrag * Rabatt;
			double RabattierterRechnungsbetrag = Rechnungsbetrag - RabattEuro;
			
			System.out.println("Rabattierter Rechungsbetrag in Euro: " + RabattierterRechnungsbetrag);
			
			System.out.println("Weitere Berechnung durchführen (Ja, Nein)?");
			String Free = myScanner.nextLine();
			String Wiederholen = myScanner.nextLine();
			
			if (Wiederholen.equals("Nein")) {
				stop = false;
			}
		}
	}

}
