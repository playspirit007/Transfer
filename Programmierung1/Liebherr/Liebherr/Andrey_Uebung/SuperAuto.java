package Liebherr.Andrey_Uebung;

public class SuperAuto implements AutoInterface {

  private int geschwindigkeit = 100;
  private ReifenInterface reifen = new WinterReifen();

  @Override
  public void gibGas(int geschwindigkeit) {
    this.geschwindigkeit = geschwindigkeit * 2;
  }

  @Override
  public int gibAktuelleGeschwindigkeitZurueck() {
    return geschwindigkeit;
  }

  @Override
  public void wechsleReifen(ReifenInterface reifen) {
    this.reifen = reifen;
  }

  @Override
  public ReifenInterface gibReifenZurueck() {
    return this.reifen;
  }
}
