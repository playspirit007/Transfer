package Klausur_Aufgabe4;

import java.util.ArrayList;

public class CookieJar {
  private final ArrayList<Cookie> cookies;

  public CookieJar() {
    cookies = new ArrayList<>();
  }

  public void addCookie(Cookie cookie) {
    cookies.add(cookie);
  }

  public StuffedCookie getStuffedCookie() {
    for (Cookie cookie : cookies) {
      if (cookie instanceof StuffedCookie) {
        return (StuffedCookie) cookie;
      }
    }
    return null;
  }
}
