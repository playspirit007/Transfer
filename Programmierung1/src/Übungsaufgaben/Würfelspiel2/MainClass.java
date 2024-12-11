package Übungsaufgaben.Würfelspiel2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	private static Scanner scanner;
	private static ArrayList<Dice> dices;
	private static int points;
	private static int rounds;
	
	public static void main(String[] agrs) {
		ArrayList<Dice> dices = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		ShapeSymbol shapesymbol;
		
		for (int i = 0; i < 5; i++) {
			Dice dice = new Dice();
			dices.add(dice);
		}
		
		int total;
		boolean repeat = true;
		while (repeat) {
			
			total = 0;
			System.out.print("Ist die Anzahl Ecken höher als 12 (Ja, Nein)?: ");
			String answer = scanner.nextLine();
		    for (int i = 0; i < dices.size(); i++) {
		    	Dice d = dices.get(i);
		        ShapeSymbol shapesymbol1 = d.rollTheDice();
		        total = total + shapesymbol1.getCorners();
		    }
		    
		    if (answer.equals("Ja")) {
		    	if (total > 12) {
		    		System.out.println("Richtig " + "(" + total + ")");
		    		points++;
		    	} else if (total < 12) {
		    		System.out.println("Falsch " + "(" + total + ")");
		    	}
		    }
		    
		    if (answer.equals("Nein")) {
		    	if (total < 12) {
		    		System.out.println("Richtig " + "(" + total + ")");
		    		points++;
		    	} else if (total > 12) {
		    		System.out.println("Falsch " + "(" + total + ")");
		    	}
		    }
		    
		    rounds++;
		    
		    System.out.print("Möchtest Du eine weitere Runde spielen (Ja, Nein)?: ");
		    String repeat1 = scanner.nextLine();
		    if (repeat1.equals("Nein")) {
		    	repeat = false;
		    }
		}
		System.out.println("Gespielte Runden: " + rounds);
		System.out.println("Erzielte Punkte: " + points);
	}
}
