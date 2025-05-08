package Aufgabe1;

import java.util.Scanner;

public class main {
	
	Scanner myScanner = new Scanner(System.in);
	
	public static void main(String[] agrs) {
		
		Barrel barrel = new Barrel(100, 0);
		
		boolean bool = true;
		while (bool) {
			System.out.println("Kapazität: " + barrel.getCapacity());
			System.out.println("Füllstand: " + barrel.getFluidLevel());
			try {
				barrel.addFluid(10);
			} catch (BarrelOverflowException e) {
				e.printStackTrace();
				bool = false;
			}
		}
	}
}
