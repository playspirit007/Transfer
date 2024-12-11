package Übungsaufgaben.Würfelspiel1;

import java.util.Scanner;

public class MainClass {
	private Player player1;
	private Player player2;
	private Scanner scanner;
	private WeaponDice weaponDice;

	public static void main(String[] agrs) {
		WeaponDice weaponDice = new WeaponDice();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Spieler 1, gib bitte Deinen Namen ein:");
		String name1 = scanner.nextLine();
		System.out.print("Spieler 2, gib bitte Deinen Namen ein:");
		String name2 = scanner.nextLine();

		Player player1 = new Player(name1, 10);
		Player player2 = new Player(name2, 10);

		while (player1.getPoints() > 0 && player2.getPoints() > 0) {
			System.out.println("Punkte " + player1.getName() + ": " + player1.getPoints());
			System.out.println("Punkte " + player2.getName() + ": " + player2.getPoints());

			weaponDice.rollTheDice();
			int total1 = weaponDice.getWeapon().getPower();
			System.out.println(
					"Waffen-Symbol " + player1.getName() + ": " + weaponDice.getWeapon().getWeaponDescription());

			weaponDice.rollTheDice();
			int total2 = weaponDice.getWeapon().getPower();
			System.out.println(
					"Waffen-Symbol " + player2.getName() + ": " + weaponDice.getWeapon().getWeaponDescription());

			if (total1 < total2) {
				player1.reducePoints((total2 - total1));
			} else if (total1 > total2) {
				player2.reducePoints((total1 - total2));
			} else if (total1 == total2) {
				System.out.println("Kein Schaden verursacht!");
			}
		
			System.out.println("");
		}
		
		
	if (player1.getPoints() > 0) {
		System.out.println(player1.getName() + " gewinnt");
	} else {
		System.out.println(player2.getName() + " gewinnt");
	}
	}
}
