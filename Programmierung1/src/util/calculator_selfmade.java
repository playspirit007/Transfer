package util;


import java.util.Scanner;

public class calculator_selfmade {

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in); // Scanner einmalig außerhalb der Schleife erstellen
        while (true) {
            System.out.print("Bitte geben Sie die erste Zahl ein:");
            int Zahl1 = scanner.nextInt();

            System.out.print("Bitte geben Sie die zweite Zahl ein:");
            int Zahl2 = scanner.nextInt();

            int Diff = Zahl1 - Zahl2;

            System.out.print("Bitte geben Sie ein Rechnenzeichen ein:");
            String RZ = scanner.next();

            if (RZ.equals("+")) {
                System.out.println("Das Ergebnis lautet:" + (Zahl1 + Zahl2));
            } else if (RZ.equals("-")) {
                System.out.println("Das Ergebnis lautet:" + Diff);
            } else if (RZ.equals("*")) {
                System.out.println("Das Ergebnis lautet:" + (Zahl1 * Zahl2));
            } else if (RZ.equals("/")) {
                if (Zahl2 != 0) {
                    System.out.println("Das Ergebnis lautet:" + (Zahl1 / Zahl2));
                } else {
                    System.out.println("Fehler: Division durch Null ist nicht erlaubt.");
                }
            }

            scanner.nextLine(); // Den Puffer leeren, damit die nächste Eingabe korrekt funktioniert

            System.out.println("Möchten Sie das Programm beenden? Dann senden Sie bitte 'Ja'.");
            System.out.println("Falls Sie das Programm weiter nutzen möchten, drücken Sie Enter.");
            String Exit = scanner.nextLine();

            if (Exit.equalsIgnoreCase("Ja")) {
                break;
            }
        }

        scanner.close();
    }
}
