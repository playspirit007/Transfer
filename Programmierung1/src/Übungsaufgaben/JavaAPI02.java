package Übungsaufgaben;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class JavaAPI02 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Gib bitte einen Wert für a ein: ");
		int a = myScanner.nextInt();
		System.out.print("Gib bitte einen Wert für b ein: ");
		int b = myScanner.nextInt();
		System.out.print("Gib bitte einen Wert für c ein: ");
		int c = myScanner.nextInt();
		
		double sqrt = Math.sqrt((b*b)-(4*(a)*(c)));
		double upperLine1 = (-(b)) + sqrt;
		double upperLine2 = (-(b)) - sqrt;
		double x1 = upperLine1/(2*a);
		double x2 = upperLine2/(2*a);
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		
		x1 = Math.round(x1 * 100.0) / 100.0;
		x2 = Math.round(x2 * 100.0) / 100.0;
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
	}

}
