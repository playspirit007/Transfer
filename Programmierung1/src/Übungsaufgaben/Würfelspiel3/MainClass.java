package Übungsaufgaben.Würfelspiel3;

import java.util.Scanner;

public class MainClass {
	private Player player1;
	private Player player2;
	private Scanner scanner;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Spieler 1, gib bitte Deinen Namen ein: ");
		String name1 = scanner.nextLine();
		System.out.print("Spieler 2, gib bitte Deinen Namen ein: ");
		String name2 = scanner.nextLine();
		
		Player player1 = new Player(name1);
		Player player2 = new Player(name2);

		while (player1.getHealthPoints() > 0 && player2.getHealthPoints() > 0) {
			System.out.println(player1.getName() + " hat " + player1.getHealthPoints() + " Lebenspunkte");
			System.out.println(player2.getName() + " hat " + player2.getHealthPoints() + " Lebenspunkte");
			
			int value1 = player1.rollTheDice();
			int value2 = player2.rollTheDice();
			
			System.out.println(player1.getName() + " würfelt eine " + value1);
			System.out.println(player2.getName() + " würfelt eine " + value2);
			
			if (value1 > value2) {
				player2.reduceHealthPoints(1);
				System.out.println(player2.getName() + " verliert einen Punkt");
			} else if (value1 < value2) {
				player1.reduceHealthPoints(1);
				System.out.println(player1.getName() + " verliert einen Punkt");
			}
			System.out.println("");
		}
		String winner;
		if (player1.getHealthPoints() <= 0) {
			winner = player2.getName();
		} else {
			winner = player1.getName();
		}
		System.out.println(winner + " gewinnt");
	}

}
