package Liebherr.Andrey_Uebung;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {

    int[] array = {1, 2, 3};
    int zahl = 1;

    SuchalgorithmusInterface suchalgorithmusInterface = new Algo1();
    suchalgorithmusInterface.sucheIn(array, zahl);
    suchalgorithmusInterface = new Algo2();
    suchalgorithmusInterface.sucheIn(array, zahl);

    List<Integer> collect =
        List.of(1, 2, 3).stream().filter(t -> t == 2).collect(Collectors.toList());

    //    List.of(1, 2, 3).forEach(t -> System.out.println(t));
    List.of(1, 2, 3).forEach(System.out::println);
    //        .forEach(
    //            new Consumer<Integer>() {
    //
    //              @Override
    //              public void accept(Integer t) {
    //                System.out.println(t);
    //              }
    //            });

    System.out.println(collect);

    //    AutoInterface porsche = new Auto();
    //    SingletonObjekt.getInstance().incCount();
    //    AutoInterface bmw = new Auto(5);
    //    SingletonObjekt.getInstance().incCount();
    //    bmw = new SuperAuto();
    //
    //    System.out.println(bmw.gibReifenZurueck());
    //    bmw.wechsleReifen(new SommerReifen());
    //    System.out.println(bmw.gibReifenZurueck());
    //    bmw.wechsleReifen(new WinterReifen());
    //
    //    System.out.println(SingletonObjekt.getInstance().getCount());

    //    porsche.gibGas(100);
    //    System.out.println("Porsche: " + porsche.gibAktuelleGeschwindigkeitZurueck());
    //    System.out.println("Bmw: %s".formatted(bmw.gibAktuelleGeschwindigkeitZurueck()));
    //
    //    System.out.println("Anzahl Autos: %s".formatted(Auto.gibAnzahlAutosZurueck()));
  }
}
