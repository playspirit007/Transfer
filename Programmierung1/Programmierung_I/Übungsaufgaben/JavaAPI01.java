package Übungsaufgaben;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class JavaAPI01 {

    public static void main(String[] args) {
        BigDecimal x = new BigDecimal("0.0"); // x als BigDecimal
        for (int i = 0; i <= 9; i++) {
            BigDecimal sinus = new BigDecimal(Math.sin(x.doubleValue())); // Sinus berechnen
            sinus = sinus.setScale(1, RoundingMode.HALF_UP); // Sinus auf eine Dezimalstelle runden
            System.out.println("x = " + x + "; sin(x) = " + sinus);
            
            // Erhöhe x um 0.1 und runde auf eine Dezimalstelle
            x = x.add(new BigDecimal("0.1")).setScale(1, RoundingMode.HALF_UP);
        }
    }
}
