package main;

import java.util.Random;

public class D08_CalculationsANDPseudoRandomNumbers {

	public static void main(String[] args) {
		/* Mathematische Berechneungen */
		double result = Math.sqrt(64);
		System.out.println("result: " + result);
		
		/* Pseudozufallszahlen */
		int randomNumber;
		
		randomNumber = (int) (Math.random() * 100);
		System.out.println("randomNumber: " + randomNumber);
		
		Random myRandom = new Random();
		randomNumber = myRandom.nextInt(1, 101);
		System.out.println("randomNumber: " + randomNumber);
	}

}
