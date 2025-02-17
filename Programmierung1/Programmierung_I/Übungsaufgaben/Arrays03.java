package Übungsaufgaben;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays03 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Geben Sie die ISBN-Nummer an: ");
		String ISBN = myScanner.nextLine();
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for (int i = 0; i <= 8; i++) {
			int copy = Character.getNumericValue(ISBN.charAt(i));
			numbers.add(copy);
		}

		int Summe = 0;
		int Produkt = 0;
		int multiplikator = 1;
		for (int i = 0; i <= 8; i++) {
			Produkt = numbers.get(i)*(multiplikator);
			Summe = Summe + Produkt;
			multiplikator++;
		}
		
		int Prüfziffer = Summe % 11;
		
		System.out.println(numbers);
		System.out.println(Summe);
		System.out.println("Die Prüfziffer lautet: " + Prüfziffer);
	}

}
