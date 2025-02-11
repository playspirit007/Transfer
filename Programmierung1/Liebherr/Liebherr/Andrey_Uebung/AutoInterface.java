package Liebherr.Andrey_Uebung;

public interface AutoInterface {

  void gibGas(int geschwindigkeit);

  int gibAktuelleGeschwindigkeitZurueck();

  void wechsleReifen(ReifenInterface reifen);

  ReifenInterface gibReifenZurueck();
}
