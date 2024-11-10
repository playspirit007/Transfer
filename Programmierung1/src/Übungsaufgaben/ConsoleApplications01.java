package Übungsaufgaben;

import java.util.Scanner;

public class ConsoleApplications01 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Bitte gib eine ganze Zahl ein:");
		int zahl1 = myScanner.nextInt();
		System.out.print("Bitte gib eine zweite ganze Zahl ein:");
		int zahl2 = myScanner.nextInt();
		int ergebnis = zahl1 + zahl2;
		System.out.print("Ergebnis: " + zahl1 + " + " + zahl2 + " = " + ergebnis );

	}

}
