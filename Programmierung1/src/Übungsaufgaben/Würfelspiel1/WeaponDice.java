package Übungsaufgaben.Würfelspiel1;

import java.util.Random;

public class WeaponDice {
	private Weapon weapon;
	
	public void rollTheDice() {
		Random myRandom = new Random();
		int x = myRandom.nextInt(1, 5);
		if (x == 1) {
			this.weapon = Weapon.CLUB;
		} else if (x == 2) {
			this.weapon = Weapon.SPEAR;
		} else if (x == 3) {
			this.weapon = Weapon.AXE;
		} else {
			this.weapon = Weapon.SWORD;
		}
	}
	public Weapon getWeapon() {
		return this.weapon;
	}
}
