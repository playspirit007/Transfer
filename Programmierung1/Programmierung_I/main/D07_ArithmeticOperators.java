package main;

public class D07_ArithmeticOperators {

	public static void main(String[] args) {
		int a , b , c;
		
		a = 5;
		b = 3;
		
		/* Addition */
		c = a + b;
		System.out.println(a + " + " + b + " = " + c);
		
		/* Subtraktion */
		c = a - b;
		System.out.println(a + " - " + b + " = " + c);
		
		/* Multiplikation */
		c = a * b;
		System.out.println(a + " * " + b + " = " + c);
		
		/* Divison */
		double d = (double) a / b; //Quoient
		System.out.println((double)a + " / " + b + " = " + d);
		c = a % b; // Modulo
		System.out.println(c); 
		
		/* Inkrementieren */
		c = 0;
		c = c +1;
		c += 1; // c = c + 1
		c++; // c = c + 1
		System.out.println("c:" + c);
		
		/* Dekrementieren */
		c = 0;
		c = c - 1;
		c -= 1; // c = c - 1
		c--; // c = c - 1
		System.out.println("c:" + c);
		
		/* Post Inkrementieren vs. Preinkrementieren */
		c = a++;
		System.out.println("a:"+ a);
		System.out.println("c:"+ c);
		
		c = ++a;
		System.out.println("a:"+ a);
		System.out.println("c:"+ c);
		
		/* Division durch Null */
		d = 1.0 / 0.0;
		System.out.println("d:" + d);
		d = 1.0 / -0.0;
		System.out.println("d:" + d);
		
		d = 0.0 / 0.0;
		System.out.println("d:" + d);
		d = 0.0 / -0.0;
		System.out.println("d:" + d);
		
		/* Teilen durch Null Laufzeitfehler
		d = 1 / 0;
		System.out.println("d:" + d);
		d = 1 / -0;
		*/
		System.out.println("d:" + d);
		
		
	}

}
