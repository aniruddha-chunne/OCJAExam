package com.OCJA.chapter7_Inheritance;

/**
 * 155 - Inheritance
 * 578 - Answer
 *
 * 27. What is the output of the following application?
 * package race;
 * abstract class Car {
 *  static { System.out.print("1"); }
 *  public Car(String name) {
 *  super();
 *  System.out.print("2");
 *  }
 *  { System.out.print("3"); }
 * }
 * public class BlueCar extends Car {
 *  { System.out.print("4"); }
 *  public BlueCar() {
 *  super("blue");
 *  System.out.print("5");
 *  }
 *  public static void main(String[] gears) {
 *  new BlueCar();
 *  }
 * }
 * A. 23451
 * B. 12354
 * C. 13245
 * D. The code does not compile
 *
 * C
 */

public class Que27 {

    public Que27()
    {
        System.out.println("constuctor");
    }

    {
        System.out.println("one");
    }
    public static void main(String[] args) {

//        new Que27();
    }
}
