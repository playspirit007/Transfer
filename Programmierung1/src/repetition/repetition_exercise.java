package repetition;

import java.util.Random;
import java.util.Scanner;

public class repetition_exercise {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner myScanner = new Scanner(System.in);

		// Spieler
		String Spieler1;
		String Spieler2;

		// Nahkampfwaffen
		String Nahkampfwaffe1;
		String Nahkampfwaffe2;

		// Fernkampfwaffen
		String Fernkampfwaffe1;
		String Fernkampfwaffe2;

		// Kaempfer
		String Kaempfer1;
		String Kaempfer2;

		// Würfel
		Random myRandom = new Random();
		int Dice1;
		int Dice2;
		int Dice3;
		int Dice4;
		int Dice5;
		int Dice6;
		int Dice7;
		int Dice8;
		int Dice9;
		int Dice10;

		System.out.print("Gib den Namen des ersten Spielers ein:");
		Spieler1 = myScanner.nextLine();
		System.out.print("Gib den Namen des Kaempfers von " + Spieler1 + " ein:");
		Kaempfer1 = myScanner.nextLine();

		System.out.print("Gib den Namen des zweiten Spielers ein:");
		Spieler2 = myScanner.nextLine();
		System.out.print("Gib den Namen des Kaempfers von " + Spieler2 + " ein:");
		Kaempfer2 = myScanner.nextLine();

		/*
		 * System.out.print("Gib den Namen der Nahkampfwaffe des Kaempfers " + Kaempfer2
		 * + " ein:"); Nahkampfwaffe2 = myScanner.nextLine();
		 * System.out.print("Gib den Namen der Fernkampfwaffe des Kaempfers " +
		 * Kaempfer2 + " ein:"); Fernkampfwaffe2 = myScanner.nextLine();
		 */

		int Runde = 0;
		int Zug = 1;

		int hpkaempfer1 = 20;
		int hpkaempfer2 = 20;

		int SchwertAW = 4; // Angriffswert
		int SchwertVW = 3; // Verteidungs-Wert
		int SchwertSW = 3; // Schaden-Wert
		int SchwertKS = 6; // Kritischer Schaden

		int LangbogenAW = 4; // Angriffswert
		int LangbogenVW = 2; // Verteidungs-Wert
		int LangbogenSW = 2; // Schaden-Wert
		int LangbogenKS = 5; // Kritischer Schaden

		int BF_AG = 4;
		int BF_RW = 5;
		int Schaden = 0;
		int Verteidigung = 0;

		while (hpkaempfer1 > 0 || hpkaempfer2 > 0) {

			Runde++;
			Zug = 1;

			System.out.println("---------------------");
			System.out.println("    Runde " + Runde + " Zug " + Zug);
			System.out.println("---------------------");
			Zug++;

			System.out.println("Welche Waffe möchten Sie für Ihren Angriff benutzen Spieler 1?");
			System.out.print("Geben Sie die Zahl \"1\" für Nahkampfwaffe oder Zahl \"2\" für Fernkampfwaffe ein!");
			int WelcheWaffeAngreifer = myScanner.nextInt();

			if (WelcheWaffeAngreifer == 1) {
				System.out.println("Angriff mit Nahkampfwaffe wird gestartet.");
				Dice1 = myRandom.nextInt(6) + 1;
				Dice2 = myRandom.nextInt(6) + 1;
				Dice3 = myRandom.nextInt(6) + 1;
				Dice4 = myRandom.nextInt(6) + 1;

				if (Dice1 >= BF_AG && Dice1 < 6) {
					Schaden = Schaden + SchwertSW;
				}
				if (Dice1 == 6) {
					Schaden = Schaden + SchwertKS;
				}
				if (Dice2 >= BF_AG && Dice2 < 6) {
					Schaden = Schaden + SchwertSW;
				}
				if (Dice2 == 6) {
					Schaden = Schaden + SchwertKS;
				}
				if (Dice3 >= BF_AG && Dice3 < 6) {
					Schaden = Schaden + SchwertSW;
				}
				if (Dice3 == 6) {
					Schaden = Schaden + SchwertKS;
				}
				if (Dice4 >= BF_AG && Dice4 < 6) {
					Schaden = Schaden + SchwertSW;
				}
				if (Dice4 == 6) {
					Schaden = Schaden + SchwertKS;
				}

			} else if (WelcheWaffeAngreifer == 2) {
				System.out.println("Angriff mit Fernkampfwaffe wird gestartet.");
				Dice1 = myRandom.nextInt(6) + 1;
				Dice2 = myRandom.nextInt(6) + 1;
				Dice3 = myRandom.nextInt(6) + 1;
				Dice4 = myRandom.nextInt(6) + 1;

				if (Dice1 >= BF_AG && Dice1 < 6) {
					Schaden = Schaden + LangbogenSW;
				}
				if (Dice1 == 6) {
					Schaden = Schaden + LangbogenKS;
				}
				if (Dice2 >= BF_AG && Dice2 < 6) {
					Schaden = Schaden + LangbogenSW;
				}
				if (Dice2 == 6) {
					Schaden = Schaden + LangbogenKS;
				}
				if (Dice3 >= BF_AG && Dice3 < 6) {
					Schaden = Schaden + LangbogenSW;
				}
				if (Dice3 == 6) {
					Schaden = Schaden + LangbogenKS;
				}
				if (Dice4 >= BF_AG && Dice4 < 6) {
					Schaden = Schaden + LangbogenSW;
				}
				if (Dice4 == 6) {
					Schaden = Schaden + LangbogenKS;
				}
			}

			System.out.println("---------------------");
			System.out.println("    Runde " + Runde + " Zug " + Zug);
			System.out.println("---------------------");
			Zug++;

			System.out.println("Welche Waffe möchten Sie für Ihre Verteidigung benutzen Spieler 2?");
			System.out.print("Geben Sie die Zahl \"1\" für Nahkampfwaffe oder Zahl \"2\" für Fernkampfwaffe ein!");
			int WelcheWaffeVerteidiger = myScanner.nextInt();

			if (WelcheWaffeVerteidiger == 1) {
				System.out.println("Verteidigung mit Nahkampfwaffe wird gestartet.");
				Dice5 = myRandom.nextInt(6) + 1;
				Dice6 = myRandom.nextInt(6) + 1;
				Dice7 = myRandom.nextInt(6) + 1;
				Dice8 = myRandom.nextInt(6) + 1;

				if (Dice5 >= BF_RW && Dice5 < 6) {
					Verteidigung = Verteidigung + SchwertVW;
				}
				if (Dice5 == 6) {
					Verteidigung = Verteidigung + SchwertKS;
				}
				if (Dice6 >= BF_RW && Dice6 < 6) {
					Verteidigung = Verteidigung + SchwertVW;
				}
				if (Dice6 == 6) {
					Verteidigung = Verteidigung + SchwertKS;
				}
				if (Dice7 >= BF_RW && Dice7 < 6) {
					Verteidigung = Verteidigung + SchwertVW;
				}
				if (Dice7 == 6) {
					Verteidigung = Verteidigung + SchwertKS;
				}
				if (Dice8 >= BF_RW && Dice8 < 6) {
					Verteidigung = Verteidigung + SchwertVW;
				}
				if (Dice8 == 6) {
					Verteidigung = Verteidigung + SchwertKS;
				}

			} else if (WelcheWaffeVerteidiger == 2) {
				System.out.println("Verteidigung mit Fernkampfwaffe wird gestartet.");
				Dice5 = myRandom.nextInt(6) + 1;
				Dice6 = myRandom.nextInt(6) + 1;
				Dice7 = myRandom.nextInt(6) + 1;
				Dice8 = myRandom.nextInt(6) + 1;

				if (Dice5 >= BF_RW && Dice5 < 6) {
					Verteidigung = Verteidigung + LangbogenVW;
				}
				if (Dice5 == 6) {
					Verteidigung = Verteidigung + LangbogenKS;
				}
				if (Dice6 >= BF_RW && Dice6 < 6) {
					Verteidigung = Verteidigung + LangbogenVW;
				}
				if (Dice6 == 6) {
					Verteidigung = Verteidigung + LangbogenKS;
				}
				if (Dice7 >= BF_RW && Dice7 < 6) {
					Verteidigung = Verteidigung + LangbogenVW;
				}
				if (Dice7 == 6) {
					Verteidigung = Verteidigung + LangbogenKS;
				}
				if (Dice8 >= BF_RW && Dice8 < 6) {
					Verteidigung = Verteidigung + LangbogenVW;
				}
				if (Dice8 == 6) {
					Verteidigung = Verteidigung + LangbogenKS;
				}
			}

			int hpVerlust = Schaden - Verteidigung;

			if (hpVerlust >= 1) {
				hpkaempfer2 = hpkaempfer2 - hpVerlust;
			} else if (hpVerlust <= 1) {
				hpVerlust = 0;
			} else if (hpkaempfer1 <= 0 || hpkaempfer2 <= 0) {
				continue;
			}

			System.out.println("Spieler 1 hat bei Spieler 2 " + hpVerlust + " Schaden verursacht.");
			System.out.println("Spieler 1 hat noch " + hpkaempfer1 + " Leben übrig.");
			System.out.println("Spieler 2 hat noch " + hpkaempfer2 + " Leben übrig.");
			hpVerlust = 0;
			Schaden = 0;
			Verteidigung = 0;

			System.out.println("---------------------");
			System.out.println("    Runde " + Runde + " Zug " + Zug);
			System.out.println("---------------------");
			Zug++;

			System.out.println("Welche Waffe möchten Sie für Ihren Angriff benutzen Spieler 2?");
			System.out.print("Geben Sie die Zahl \"1\" für Nahkampfwaffe oder Zahl \"2\" für Fernkampfwaffe ein!");
			int WelcheWaffeAngreifer2 = myScanner.nextInt();

			if (WelcheWaffeAngreifer2 == 1) {
				System.out.println("Angriff mit Nahkampfwaffe wird gestartet.");
				Dice1 = myRandom.nextInt(6) + 1;
				Dice2 = myRandom.nextInt(6) + 1;
				Dice3 = myRandom.nextInt(6) + 1;
				Dice4 = myRandom.nextInt(6) + 1;

				if (Dice1 >= BF_AG && Dice1 < 6) {
					Schaden = Schaden + SchwertSW;
				}
				if (Dice1 == 6) {
					Schaden = Schaden + SchwertKS;
				}
				if (Dice2 >= BF_AG && Dice2 < 6) {
					Schaden = Schaden + SchwertSW;
				}
				if (Dice2 == 6) {
					Schaden = Schaden + SchwertKS;
				}
				if (Dice3 >= BF_AG && Dice3 < 6) {
					Schaden = Schaden + SchwertSW;
				}
				if (Dice3 == 6) {
					Schaden = Schaden + SchwertKS;
				}
				if (Dice4 >= BF_AG && Dice4 < 6) {
					Schaden = Schaden + SchwertSW;
				}
				if (Dice4 == 6) {
					Schaden = Schaden + SchwertKS;
				}

			} else if (WelcheWaffeAngreifer2 == 2) {
				System.out.println("Angriff mit Fernkampfwaffe wird gestartet.");
				Dice1 = myRandom.nextInt(6) + 1;
				Dice2 = myRandom.nextInt(6) + 1;
				Dice3 = myRandom.nextInt(6) + 1;
				Dice4 = myRandom.nextInt(6) + 1;

				if (Dice1 >= BF_AG && Dice1 < 6) {
					Schaden = Schaden + LangbogenSW;
				}
				if (Dice1 == 6) {
					Schaden = Schaden + LangbogenKS;
				}
				if (Dice2 >= BF_AG && Dice2 < 6) {
					Schaden = Schaden + LangbogenSW;
				}
				if (Dice2 == 6) {
					Schaden = Schaden + LangbogenKS;
				}
				if (Dice3 >= BF_AG && Dice3 < 6) {
					Schaden = Schaden + LangbogenSW;
				}
				if (Dice3 == 6) {
					Schaden = Schaden + LangbogenKS;
				}
				if (Dice4 >= BF_AG && Dice4 < 6) {
					Schaden = Schaden + LangbogenSW;
				}
				if (Dice4 == 6) {
					Schaden = Schaden + LangbogenKS;
				}
			}

			System.out.println("---------------------");
			System.out.println("    Runde " + Runde + " Zug " + Zug);
			System.out.println("---------------------");
			Zug++;

			System.out.println("Welche Waffe möchten Sie für Ihre Verteidigung benutzen Spieler 1?");
			System.out.print("Geben Sie die Zahl \"1\" für Nahkampfwaffe oder Zahl \"2\" für Fernkampfwaffe ein!");
			int WelcheWaffeVerteidiger2 = myScanner.nextInt();

			if (WelcheWaffeVerteidiger2 == 1) {
				System.out.println("Verteidigung mit Nahkampfwaffe wird gestartet.");
				Dice5 = myRandom.nextInt(6) + 1;
				Dice6 = myRandom.nextInt(6) + 1;
				Dice7 = myRandom.nextInt(6) + 1;
				Dice8 = myRandom.nextInt(6) + 1;

				if (Dice5 >= BF_RW && Dice5 < 6) {
					Verteidigung = Verteidigung + SchwertVW;
				}
				if (Dice5 == 6) {
					Verteidigung = Verteidigung + SchwertKS;
				}
				if (Dice6 >= BF_RW && Dice6 < 6) {
					Verteidigung = Verteidigung + SchwertVW;
				}
				if (Dice6 == 6) {
					Verteidigung = Verteidigung + SchwertKS;
				}
				if (Dice7 >= BF_RW && Dice7 < 6) {
					Verteidigung = Verteidigung + SchwertVW;
				}
				if (Dice7 == 6) {
					Verteidigung = Verteidigung + SchwertKS;
				}
				if (Dice8 >= BF_RW && Dice8 < 6) {
					Verteidigung = Verteidigung + SchwertVW;
				}
				if (Dice8 == 6) {
					Verteidigung = Verteidigung + SchwertKS;
				}

			} else if (WelcheWaffeVerteidiger2 == 2) {
				System.out.println("Verteidigung mit Fernkampfwaffe wird gestartet.");
				Dice5 = myRandom.nextInt(6) + 1;
				Dice6 = myRandom.nextInt(6) + 1;
				Dice7 = myRandom.nextInt(6) + 1;
				Dice8 = myRandom.nextInt(6) + 1;

				if (Dice5 >= BF_RW && Dice5 < 6) {
					Verteidigung = Verteidigung + LangbogenVW;
				}
				if (Dice5 == 6) {
					Verteidigung = Verteidigung + LangbogenKS;
				}
				if (Dice6 >= BF_RW && Dice6 < 6) {
					Verteidigung = Verteidigung + LangbogenVW;
				}
				if (Dice6 == 6) {
					Verteidigung = Verteidigung + LangbogenKS;
				}
				if (Dice7 >= BF_RW && Dice7 < 6) {
					Verteidigung = Verteidigung + LangbogenVW;
				}
				if (Dice7 == 6) {
					Verteidigung = Verteidigung + LangbogenKS;
				}
				if (Dice8 >= BF_RW && Dice8 < 6) {
					Verteidigung = Verteidigung + LangbogenVW;
				}
				if (Dice8 == 6) {
					Verteidigung = Verteidigung + LangbogenKS;
				}

				hpVerlust = Schaden - Verteidigung;
				if (hpVerlust >= 1) {
					hpkaempfer1 = hpkaempfer1 - hpVerlust;
				} else if (hpVerlust <= 1) {
					hpVerlust = 0;
				} else if (hpkaempfer1 < 0 || hpkaempfer2 < 0) {
					continue;
				}

			}
				System.out.println("Spieler 2 hat bei Spieler 1 " + hpVerlust + " Schaden verursacht.");
				System.out.println("Spieler 1 hat noch " + hpkaempfer1 + " Leben übrig.");
				System.out.println("Spieler 2 hat noch " + hpkaempfer2 + " Leben übrig.");
				hpVerlust = 0;
				Schaden = 0;
				Verteidigung = 0;
			

			if (hpkaempfer2 < 0) {
				System.out.println("Spieler 1 hat gewonnen und " + hpkaempfer1 + " Leben übrig.");
			} else if (hpkaempfer1 < 0) {
				System.out.println("Spieler 2 hat gewonnen und " + hpkaempfer2 + " Leben übrig.");
			}
		}
	}
}