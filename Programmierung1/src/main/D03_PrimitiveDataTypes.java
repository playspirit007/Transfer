package main;

import java.math.BigDecimal;

/**
 * Primitive Data Types
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D03_PrimitiveDataTypes {

  public static void main(String[] args) {

    /* Ganze Zahlen */
    byte byte1 = 42;
    short short1 = -4_444;
    int int1 = 1_000_000_000;
    long long1 = 50_000_000_000L;

    System.out.println("byte1: " + byte1);
    System.out.println("short1: " + short1);
    System.out.println("int1: " + int1);
    System.out.println("long1: " + long1);

    /* Zeichen */
    char char1 = 'A'; // Symbol des Zeichens 'A'
    char char2 = 0b1000001; // Binärwert des Zeichens 'A'
    char char3 = 0101; // Oktalwert des Zeichens 'A'
    char char4 = 65; // Dezimalwert des Zeichens 'A'
    char char5 = 0x41; // Hexdezimalwert des Zeichens 'A'
    char char6 = '\u0041'; // Unicode des Zeichens 'A'

    System.out.println("char1: " + char1);
    System.out.println("char2: " + char2);
    System.out.println("char3: " + char3);
    System.out.println("char4: " + char4);
    System.out.println("char5: " + char5);
    System.out.println("char6: " + char6);

    /* Wahrheitswert */
    boolean boolean1 = true;

    System.out.println("boolean1: " + boolean1);

    /* Gleitkommazahlen */
    float float1 = 0.1F;
    double double1 = 0.1;

    System.out.println("float1: " + float1);
    System.out.println("double1: " + double1);

    BigDecimal bigDecimal1 = new BigDecimal(0.1F);
    BigDecimal bigDecimal2 = new BigDecimal(0.1);

    System.out.println("bigDecimal1: " + bigDecimal1);
    System.out.println("bigDecimal2: " + bigDecimal2);

  }

}
