package Übungsaufgaben.Würfelspiel4;

import java.util.Scanner;

public class MainClass {
	private static Player player1;
	private static Player player2;
	private static Scanner scanner;
	private static AmountDice amountDice;
	private static FoodCategoryDice foodCategoryDice;
	private static int rounds;
	
	public static void main(String[] agrs) {
		Scanner myScanner = new Scanner(System.in);
		amountDice = new AmountDice();
		foodCategoryDice = new FoodCategoryDice();
		
		System.out.print("Spieler 1, gib bitte Deinen Namen ein: ");
		String name1 = myScanner.nextLine();
		System.out.print("Spieler 2, gib bitte Deinen Namen ein: ");
		String name2 = myScanner.nextLine();
		
		Player player1 = new Player(name1);
		Player player2 = new Player(name2);
		
		while (player1.getPoints() > 0 && player2.getPoints() > 0) {
			System.out.println(player1.getName() + " hat " + player1.getPoints() + " Punkte, " 
			+ player2.getName() + " hat " + player2.getPoints() + " Punkte");
			
			int value1 = 0;
			int value2 = 0;
			FoodCategory food1;
			value1 = amountDice.rollTheDice();
			food1 = foodCategoryDice.rollTheDice();
			value2 = food1.getPoints();
			int result1 = value1 * value2;
			System.out.println(player1.getName() + " würfel " + value1 + " x " + food1.getDescription() + " (" + value2 + " Punkte)");
			
			value1 = amountDice.rollTheDice();
			food1 = foodCategoryDice.rollTheDice();
			value2 = food1.getPoints();
			int result2 = value1 * value2;
			System.out.println(player2.getName() + " würfel " + value1 + " x " + food1.getDescription() + " (" + value2 + " Punkte)");
			
			if (result1 > result2) {
				int val = result1 - result2;
				player2.setPoints(val);
				System.out.println(player2.getName() + " werden " + val + " Punkte abgezogen");
			} else if (result1 < result2) {
				int val = result2 - result1;
				player1.setPoints(val);
				System.out.println(player1.getName() + " werden " + val + " Punkte abgezogen");
			}
			
			rounds++;
			System.out.println("");
		}
		if (player1.getPoints() <= 0) {
			System.out.println(player2.getName() + " gewinnt");
		} else {
			System.out.println(player1.getName() + " gewinnt");
		}
	}
}
