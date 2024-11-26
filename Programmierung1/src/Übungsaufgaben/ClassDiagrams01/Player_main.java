package Übungsaufgaben.ClassDiagrams01;

import java.util.Random;
import java.util.Scanner;

import Übungsaufgaben.ClassDiagrams01.*;

public class Player_main {

	public static void main(String[] args) {
		Random myRandom = new Random();
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Geben Sie den Namen vom ersten Spieler ein: ");
		String Name1 = myScanner.nextLine();
		System.out.print("Geben Sie den Namen vom zweiten Spieler ein: ");
		String Name2 = myScanner.nextLine();
		
		//Objekte erstellen
		Player Player1 = new Player(Name1);
		Player Player2 = new Player(Name2);
		
		//Würfeln
		Player1.setScore(myRandom.nextInt(1, 7));
		Player2.setScore(myRandom.nextInt(1, 7));
		
		//Gewinner
		System.out.println(Player1.getName() + " würfelt eine " + Player1.getScore());
		System.out.println(Player2.getName() + " würfelt eine " + Player2.getScore());
		if (Player1.getScore() > Player2.getScore()) {
			System.out.println(Player1.getName() + " gewinnt");
		} else if (Player2.getScore() > Player1.getScore()) {
			System.out.println(Player2.getName() + " gewinnt");
		} else {
			System.out.println("Unentschieden");
		}
		
		myScanner.close();
	

	}

}
