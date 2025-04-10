package MyZirkulaereQueue;

public class main {

  public static void main(String[] agrs) {
    Queue zirkQueue = new Queue();

    for (int i = 1; i <= 15; i++) {
      zirkQueue.enqueue(i);
    }

    zirkQueue.toString();
  }
}
