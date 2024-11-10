package main;

import java.util.Scanner;

public class D09_ConsoleInputs {

	public static void main(String[] args) {
		/* Scanner initalisieren */
		Scanner myScanner = new Scanner(System.in);
		
		/* Werte auslesen und zurückgeben */
		System.out.print("Bitte gib eine ganze Zahl ein:");
		int int1 = myScanner.nextInt();
		System.out.println("int1: " + int1);
		
		System.out.print("Bitte gib eine reele Zahl ein:");
		double double1 = myScanner.nextDouble();
		System.out.println("double1: " + double1);
		
		System.out.print("Bitte gib einen Wahrheitswert ein:");
		boolean boolean1 = myScanner.nextBoolean();
		System.out.println("boolean1: " + boolean1);
		
		System.out.print("Bitte gib genau ein Zeichen ein:");
		char char1 = myScanner.next().charAt(0);
		System.out.println("char1: " + char1);
		
		System.out.print("Bitte gib deinen Vornamen ein:");
		String firstname = myScanner.next();
		System.out.println("firstname: " + firstname);
		
		System.out.print("Bitte gib deinen vollständigen Namen ein:");
		myScanner.nextLine();
		String fullname = myScanner.nextLine();
		System.out.println("fullname: " + fullname);
	}

}
