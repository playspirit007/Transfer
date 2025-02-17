package Übungsaufgaben.Kreatur;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CreatureReader {

	File file = new File("/Programmierung1/src/main/resources/Kreaturen");
	public ArrayList<Creature> getCreatures(File file) throws FileNotFoundException {
		ArrayList<Creature> creature = new ArrayList<>();
		Scanner myScanner = new Scanner(file);
		while (myScanner.hasNextLine()) {
			String line = myScanner.nextLine();
			String[] help = line.split(";");
			String name = help[0];
			int x = Integer.valueOf(help[1]);
			int y = Integer.valueOf(help[2]);
			Position position = new Position(x, y);
			Type type = Type.valueOf(help[3]);
			
			Creature Creature = new Creature(name, position, type);
			creature.add(Creature);
			}
		
		return creature;

	}

}
