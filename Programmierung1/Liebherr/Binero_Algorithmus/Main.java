package Binero_Algorithmus;

public class Main {
  public static void main(String[] args) {
    Functions solver = new Functions();
    char[][] bineroMatrix = solver.erzeugeBineroMatrix();

    System.out.println("Vor Beginn:");
    solver.bineroDrucken(bineroMatrix);

    solver.lösenBinero(bineroMatrix);
  }
}
