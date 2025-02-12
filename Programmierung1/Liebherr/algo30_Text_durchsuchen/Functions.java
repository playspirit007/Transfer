package algo30_Text_durchsuchen;

import java.util.ArrayList;

public class Functions {

  protected boolean searchAlgo(ArrayList<String> text, String word) {
    StringBuilder fullText = new StringBuilder();
    for (String character : text) { // Zeichen zu einem String zusammenfügen
      fullText.append(character);
    }

    return fullText.toString().contains(word); // Prüft, ob das Wort enthalten ist
  }
}
