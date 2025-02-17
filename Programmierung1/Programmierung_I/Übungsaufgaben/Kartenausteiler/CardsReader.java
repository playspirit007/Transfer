package Übungsaufgaben.Kartenausteiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CardsReader {
	private ArrayList<Card> cards = new ArrayList<>();
	File file = new File("/Programmierung1/src/main/resources/Spielerdeck");
	
	
	public ArrayList<Card> getCards(File file) throws FileNotFoundException {
		Scanner myScanner  = new Scanner(file);
		while (myScanner.hasNextLine()) {
			String line = myScanner.nextLine();
			String[] name = line.split(";");
			String color = name[0];
			int value = Integer.parseInt(name[1]);
			
			Card card = new Card(color, value);
			cards.add(card);
		}
		
		
		return (ArrayList<Card>) cards;
	}
}
