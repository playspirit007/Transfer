package main;

import model.LightBulb;
import model.TableLight;

/**
 * Classes
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D18_Classes {

  public static void main(String[] args) {

    LightBulb redLightBulb = new LightBulb();
    LightBulb blueLightBulb = new LightBulb();

    TableLight tableLight1 = new TableLight();
    System.out.println(tableLight1.isShining());
    tableLight1.plugIn();
    tableLight1.switchOn();
    tableLight1.changeLightBulb(blueLightBulb);
    System.out.println(tableLight1.isShining());
    tableLight1.switchOff();
    System.out.println(tableLight1.isShining());
    LightBulb oldLightBulb = tableLight1.changeLightBulb(redLightBulb);

  }

}
