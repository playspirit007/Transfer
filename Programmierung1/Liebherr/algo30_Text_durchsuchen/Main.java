package algo30_Text_durchsuchen;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<String> text = new ArrayList<>();
    String input = "Dies ist ein Beispieltext.";
    for (char c : input.toCharArray()) {
      text.add(String.valueOf(c));
    }

    String word1 = "Beispiel";
    String word2 = "nichtda";

    Functions f = new Functions();
    System.out.print(word1 + " enthalten: ");
    System.out.println(f.searchAlgo(text, word1)); // Sollte true ausgeben
    System.out.print(word2 + " enthalten: ");
    System.out.println(f.searchAlgo(text, word2)); // Sollte false ausgeben
  }
}
