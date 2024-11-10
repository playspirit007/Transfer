package main;

import java.util.Scanner;

public class D11_IfCases {
	
	public static void main(String[] agrs) {
		Scanner myScanner = new Scanner(System.in);
		int age;
		
		System.out.print("Gib dein Alter ein:");
		age = myScanner.nextInt();
		
		/* Einfachverzweigung */
		
		if (age < 18) {
			System.out.println("Du bist ein Kind");
		} else if (age < 18) {
			System.out.println("Du bist ein Jugendlicher");
		} else if (age < 65) {
			System.out.println("Du bist ein Erwachsener");
		} else {
			System.out.println("Du nst ein alter Mensch");
		}
		
		//Vergleichsoperatoren: != (ungleich), == (gleich gleich), > (größer), 
		//< (kleiner), >= (größergleich), <= (kleinergleich)
		
		//Logische Operatoren: && (UND), || (OR), 
		
		System.out.print("Bitte gib die Zeichenkette \"true\" ein: ");
		String empty = myScanner.nextLine();
		String input = myScanner.nextLine();
		if (input.equals("true")) {
			System.out.println("Gut gemacht");
		} else {
			System.out.println("Leider falsch");
		}
	}
	
}
