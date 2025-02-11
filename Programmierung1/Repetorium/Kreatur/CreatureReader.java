package Kreatur;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CreatureReader {

  public ArrayList<Creature> getCreatures(File file1) throws FileNotFoundException {
    File file = file1;
    Scanner myScanner = new Scanner(file);
    String[] Zeile = new String[10];
    Type type;
    ArrayList<Creature> creatures = new ArrayList<>();

    while (myScanner.hasNextLine()) {
      String input = myScanner.nextLine();
      Zeile = input.split(";");

      String name = Zeile[0];
      String type0 = Zeile[1];
      if (type0.contains("Monster")) {
        type = Type.MONSTER;
      } else if (type0.contains("Skeleton")) {
        type = Type.SKELETON;
      } else if (type0.contains("Vampire")) {
        type = Type.VAMPIRE;
      } else {
        type = Type.ZOMBIE;
      }
      int x = Integer.parseInt(Zeile[2]);
      int y = Integer.parseInt(Zeile[3]);
      Position position = new Position(x, y);
      Creature creature = new Creature(name, position, type);
      creatures.add(creature);

      String input2 = myScanner.nextLine();
      Zeile = input2.split(";");

      for (String Zug : Zeile) {
        if (Zug.contains("DOWN")) {
          creature.moveDown();
        } else if (Zug.contains("UP")) {
          creature.moveUp();
        } else if (Zug.contains("LEFT")) {
          creature.moveLeft();
        } else {
          creature.moveRight();
        }
      }
    }
    myScanner.close();
    return creatures;
  }
}
