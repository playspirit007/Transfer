package Übungsaufgaben;

import java.util.Scanner;

public class ConsoleApplications02 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Gib bitte eine ganze Zahl ein:");
		int zahl1 = myScanner.nextInt();
		System.out.print("Gib bitte eine weitere ganze Zahl ein:");
		int zahl2 = myScanner.nextInt();
		int ergebnis = zahl2/zahl1;
		System.out.println("Ergebnis: " + zahl1 + " von " + zahl2 + " sind " + ergebnis + "%");
	}

}
