package Kreatur;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("src/Kreatur/Spielverlauf.txt");
    CreatureReader reader = new CreatureReader();
    System.out.println(reader.getCreatures(file));
  }
}
