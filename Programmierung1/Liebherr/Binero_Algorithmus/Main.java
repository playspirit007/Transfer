package Binero_Algorithmus;

public class Main {

  public static void main(String[] args) {
    var function = new Functions();
    char[][] Binero = function.BineroMatrix();
    System.out.println("Vor Beginn:");
    function.printBinero(Binero);

    function.lösenBinero(Binero);

    System.out.println(" ");
    System.out.println("Lösung: ");
    function.printBinero(Binero);
  }
}
