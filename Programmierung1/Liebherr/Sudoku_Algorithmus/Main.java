package Sudoku_Algorithmus;

import java.io.FileNotFoundException;

public class Main {

  public static void main(String[] agrs) throws FileNotFoundException {
    Functions function = new Functions();
    char[][] startSudoku = new char[9][9];

    //
    startSudoku = function.createSudoku();

    System.out.println("Vor Beginn: ");
    function.printSudoku();

    // Lösen
    function.solveSudoku();
    System.out.println(" ");

    System.out.println("Lösung: ");
    function.printSudoku();

    //    System.out.println(startSudoku[0][0]);
    //    System.out.println(startSudoku[8][8]);
    //    System.out.println(startSudoku[0][5]);
  }
}
