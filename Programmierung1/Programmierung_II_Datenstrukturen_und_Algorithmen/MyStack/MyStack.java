package MyStack;

public class MyStack {

  private Node top;

  // Listenelement (Node)
  private static class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
    }
  }

  public void push(int value) {
    Node newNode = new Node(value);
    newNode.next = top;
    newNode.next = top; // Ehemaliges oberestes Element
    top = newNode; // Neues oberstes Element
  }

  public int pop() {
    if (top == null) {
      System.out.println("Keine Einträge vorhanden. Stack ist leer!");
    }
    int value = top.value;
    top = top.next;
    return value;
  }

  public int peek() {
    return top.value;
  }

  @Override
  public String toString() {
    Node viewTop = top;
    System.out.println("Stack (toString() Methode): ");
    while (viewTop != null) {
      System.out.print(viewTop.value + " ");
      viewTop = viewTop.next;
    }
    System.out.println();
    return " ";
  }
}
