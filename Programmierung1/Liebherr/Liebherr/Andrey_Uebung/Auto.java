package Liebherr.Andrey_Uebung;

public class Auto implements AutoInterface {

  private int aktuelleGeschwindigkeit;
  private ReifenInterface reifen;

  private static int anzahlAutos = 0;

  public Auto() {
    this(0);
  }

  public Auto(int aktuelleGeschwindigkeit) {
    prufeGeschwindigkeit(aktuelleGeschwindigkeit);
    this.aktuelleGeschwindigkeit = aktuelleGeschwindigkeit;
    this.reifen = new SommerReifen();
    anzahlAutos++;
  }

  @Override
  public void gibGas(int geschwindigkeit) {
    prufeGeschwindigkeit(geschwindigkeit);
    aktuelleGeschwindigkeit += geschwindigkeit;
  }

  private void prufeGeschwindigkeit(int geschwindigkeit) {
    if (geschwindigkeit < 0) {
      throw new IllegalArgumentException("Geschwindigkeit darf nicht kleiner 0 sein");
    }
  }

  @Override
  public int gibAktuelleGeschwindigkeitZurueck() {
    return this.aktuelleGeschwindigkeit;
  }

  @Override
  public ReifenInterface gibReifenZurueck() {
    return this.reifen;
  }

  public static int gibAnzahlAutosZurueck() {
    return anzahlAutos;
  }

  @Override
  public void wechsleReifen(ReifenInterface reifen) {
    this.reifen = reifen;
  }
}
