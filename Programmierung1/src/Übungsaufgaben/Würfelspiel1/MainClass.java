package Übungsaufgaben.Würfelspiel1;

import java.util.Scanner;

public class MainClass {

	private Player player1;
	private Player player2;
	private Scanner scanner;
	private WeaponDice weaponDice1;
	private WeaponDice weaponDice2;
	
	public MainClass() {
		this.weaponDice1 = new WeaponDice();
		this.weaponDice2 = new WeaponDice();
	}
	
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Spieler 1, gib bitte Deinen Namen ein: ");
		String name1 = myScanner.nextLine();
		System.out.print("Spieler 2, gib bitte Deinen Namen ein: ");
		String name2 = myScanner.nextLine();
		
		Player player1 = new Player(name1, 10);
		Player player2 = new Player(name2, 10);
		
		WeaponDice weaponDice1 = new WeaponDice();
		WeaponDice weaponDice2 = new WeaponDice();
		
		
		while (player1.getPoints() > 0 && player2.getPoints() > 0) {
			System.out.println("Punkte " + player1.getName() + ": " + player1.getPoints());
			System.out.println("Punkte " + player1.getName() + ": " + player1.getPoints());
			
			weaponDice1.rollTheDice();
	        Weapon weapon1 = weaponDice1.getWeapon();
	        System.out.println("Waffen-Symbol " + player1.getName() + ": " + weapon1.getDescription());
	        
			weaponDice2.rollTheDice();
	        Weapon weapon2 = weaponDice2.getWeapon();
	        System.out.println("Waffen-Symbol " + player2.getName() + ": " + weapon2.getDescription());
	        
	        int Hits = 0;
	        if (weaponDice1.getWeapon().getPower() > weaponDice2.getWeapon().getPower()) {
	        	Hits = weaponDice1.getWeapon().getPower() - weaponDice2.getWeapon().getPower();
	        	player2.reducePoints(Hits);
	        	System.out.println("Punkte " + player2.getName() + " " + player2.getPoints());
	        	System.out.println("");
			} else if (weaponDice1.getWeapon().getPower() < weaponDice2.getWeapon().getPower()) {
	        	Hits = weaponDice2.getWeapon().getPower() - weaponDice1.getWeapon().getPower();
	        	player1.reducePoints(Hits);
	        	System.out.println("Punkte " + player1.getName() + " " + player1.getPoints());
	        	System.out.println("");
			}
	        
		}
		

	}

}
