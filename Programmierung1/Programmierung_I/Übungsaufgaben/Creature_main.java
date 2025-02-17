package Übungsaufgaben;

import Übungsaufgaben.Creature;

public class Creature_main {

	public static void main(String[] args) {
		Creature Zombie = new Creature("Zombie", 2, 10);
		Creature Vampir = new Creature("Vampir", 3, 10);

		System.out.println(Zombie.getName());
		System.out.println(Vampir.getName());

		while (Zombie.getHitPoints() >= 0 && Vampir.getHitPoints() >= 0) {

			System.out.println("Zombie greift Vampir an und erzielt " + Zombie.getAttackValue() + " Schaden.");
			Zombie.attackCreature(Vampir);

			if (Vampir.getHitPoints() <= 0) {
				Vampir.setHitPoints(0);
				System.out.println("Vampir hat noch " + Vampir.getHitPoints() + " Lebenspunkte.");
				break;
			}
			System.out.println("Vampir hat noch " + Vampir.getHitPoints() + " Lebenspunkte.");

			System.out.println("Vampir greift Zombie an und erzielt " + Vampir.getAttackValue() + " Schaden.");
			Vampir.attackCreature(Zombie);
			
			if (Zombie.getHitPoints() <= 0) {
				Zombie.setHitPoints(0);
				System.out.println("Zombie hat noch " + Zombie.getHitPoints() + " Lebenspunkte.");
				break;
			}
			
			System.out.println("Zombie hat noch " + Zombie.getHitPoints() + " Lebenspunkte.");
			
		}

	}

}
