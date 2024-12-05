package Übungsaufgaben.Würfelspiel1;

import java.util.Random;

public class WeaponDice {
	private Weapon weapon;

	public void rollTheDice() {
		Random myRandom = new Random();
		int xrandom = myRandom.nextInt(1, 4);
		this.weapon = Weapon.values()[xrandom];
	}

	public Weapon getWeapon() {
		return weapon;
	}
}
