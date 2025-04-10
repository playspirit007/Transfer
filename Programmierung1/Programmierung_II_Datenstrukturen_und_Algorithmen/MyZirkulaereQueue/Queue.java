package MyZirkulaereQueue;

public class Queue {

  private Node head;
  private Node tail;
  public static int counter;

  // Listenelement (Node)
  private static class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
      counter++;
    }
  }

  // Neue Elemente kommen nach vorne
  public void enqueue(int value) {
    Node newNode = new Node(value);

    if (head == null) {
      // erstes Element
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head; // vorne anhängen
      head = newNode; // neuer Kopf
    }
  }

  // Entfernt das vorderste Element (wie ein Stack)
  public int dequeue() {
    if (head == null) {
      System.out.println("Keine Einträge vorhanden. Queue ist leer!");
      return -1;
    }

    int value = head.value;
    head = head.next;
    counter--;

    // Wenn nach Entfernen nichts mehr da ist → tail zurücksetzen
    if (head == null) {
      tail = null;
    }

    return value;
  }

  public int peek() {
    if (head == null) {
      throw new IllegalStateException("Queue ist leer!");
    }
    return head.value;
  }

  @Override
  public String toString() {
    Node current = head;
    System.out.print("Aktueller Inhalt der Queue: ");
    while (current != null) {
      System.out.print(current.value + " ");
      current = current.next;
    }
    System.out.println();
    System.out.println("Tail zeigt auf: " + (tail != null ? tail.value : "null"));
    System.out.println("Head zeigt auf: " + (head != null ? head.value : "null"));
    return "";
  }
}
