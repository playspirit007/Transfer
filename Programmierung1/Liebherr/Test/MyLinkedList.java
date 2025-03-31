package Test;

import java.util.LinkedList;

public class MyLinkedList {

  public static void main(String[] agrs) {
    LinkedList<String> link = new LinkedList<>();

    link.add("Elias");
    link.add("Lars");
    link.add("Michael");
    link.add("Philipp");
    link.add("Stefan");
    link.add("Moritz");

    for (String name : link) {
      System.out.println(name);
    }

    System.out.println(" ");
    System.out.println("Erste Name der Liste: " + link.getFirst());
    System.out.println("Letzter Name der Liste: " + link.getLast());
    System.out.println("Der Name Elias ist in der Liste enthalten: " + link.contains("Elias"));
    System.out.println("Anzahl von Elementen in der Liste: " + link.size());
  }
}
