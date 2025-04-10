package MyStack;

public class main {

  public static void main(String[] agrs) {

    MyStack stack = new MyStack();

    int i = 1;
    while (i <= 20) {
      stack.push(i);
      i++;
    }

    System.out.println("Erstes Element (peek() Methode): ");
    System.out.println(stack.peek());

    System.out.println("Gelöschtes Element (pop() Methode): ");
    System.out.println(stack.pop());

    System.out.println("Gelöschtes Element (pop() Methode): ");
    System.out.println(stack.pop());

    System.out.println("Erstes Element (peek() Methode): ");
    System.out.println(stack.peek());

    System.out.println(" ");
    stack.toString();
  }
}
