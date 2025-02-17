package Übungsaufgaben;

import java.util.ArrayList;

public class Arrays01 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		int Ergebnis;
		
		for (int i = 1; i <= 15; i++) {
			Ergebnis = (int) Math.pow(2, i);
			numbers.add(Ergebnis);
			
		System.out.println(Ergebnis);
		}

	}

}

