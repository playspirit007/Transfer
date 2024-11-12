package Übungsaufgaben;

import java.util.ArrayList;

public class Arrays02 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(8);
        numbers.add(2);
        numbers.add(6);
        numbers.add(9);
        numbers.add(1);
        int laenge = numbers.size();

        for (int i = 0; i <= laenge-2; i++) {  // Schleifenbedingung angepasst
            int copy = numbers.get(0);      // Erstes Element kopieren
            numbers.remove(0);              // Erstes Element entfernen
            numbers.add(copy);              // Kopiertes Element ans Ende setzen
        }

        System.out.println(numbers); // Ausgabe der Liste zur Überprüfung
    }
}
