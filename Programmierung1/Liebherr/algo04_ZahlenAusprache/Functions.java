package algo04_ZahlenAusprache;

public class Functions {
  private String einer[] = {
    " ",
    "ein",
    "zwei",
    "drei",
    "vier",
    "fünf",
    "sechs",
    "sieben",
    "acht",
    "neun",
    "zehn",
    "elf",
    "zwölf",
    "dreizehn",
    "vierzehn",
    "fünfzehn",
    "sechszehn",
    "siebzehn",
    "achtzehn",
    "neunzehn"
  };

  private String zehner[] = {
    " ",
    " ",
    "zwanzig",
    "dreißig",
    "vierzig",
    "fünfzig",
    "sechszig",
    "siebzig",
    "achtzig",
    "neunzig"
  };

  public String auspracheZahl(int x) {
    String Aussage = "";

    int tausend = x / 1000;
    if (tausend > 0) {
      Aussage += einer[tausend] + "tausend";
    }

    int hundert = (x % 1000) / 100;
    if (hundert > 0) {
      Aussage += einer[hundert] + "hundert";
    }

    int rest = x % 100; // Rest der Zahl unter 100
    if (rest < 20) {
      // Zahlen von 1 bis 19 sind direkt in "einer[]"
      Aussage += einer[rest];
    } else {
      int einerZahl = rest % 10; // Einerstelle
      int zehnerZahl = rest / 10; // Zehnerstelle

      if (einerZahl > 0) {
        Aussage += einer[einerZahl] + "und";
      }
      Aussage += zehner[zehnerZahl]; // Korrekte Zehnerstelle aus Array holen
    }

    return Aussage;
  }
}
