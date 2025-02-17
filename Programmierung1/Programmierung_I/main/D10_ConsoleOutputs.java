package main;

import java.util.Locale;

public class D10_ConsoleOutputs {

	public static void main(String[] args) {
		
		// print und println Methode
		System.out.println("Text1");
		System.out.print("Text2");
		System.out.print("Text3");
		System.out.println("Text4");

		//printf-Methode
		//Aufbau einer Formatierungsregel: %[flags][width][.precision] conversion character
		
		// String Formatierung
		
		String text = "Hallo";
		String name = "Hans-Peter";
		System.out.printf("%s %s%n", text, name);
		System.out.printf("%S %S%n", text, name); //Grossbuchstaben
		System.out.printf("%20s %s%n", text, name); //Festlegen der Ausgabelänge
		System.out.printf("%-20s %s%n", text, name); //Linksbündig die Ausgabe
		
		//Dezimalzahlen-Formatierung
		
		System.out.println(1_000_000_000);
		System.out.printf("%,d%n", 1_000_000_000); //Festlegen der Tausendertrennzeichen
		System.out.printf(Locale.JAPAN, "%,d%n" , 1_000_000_000);
		
		//Gleitkommazahlen-Formatierung
		System.out.printf("%.2f%n", 3.817264532); //Festlegen der Genauigkeit (Mit Runden von printf)
	}

}
