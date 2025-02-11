package Kreatur;

public class Position {
  private int x;
  private int y;

  public Position(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void increaseY() {
    this.y += 1;
  }

  public void increaseX() {
    this.x += 1;
  }

  public void decreaseX() {
    this.x -= 1;
  }

  public void decreaseY() {
    this.y -= 1;
  }
}
