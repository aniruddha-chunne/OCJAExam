package com.OCJA.chapter7_Inheritance;

/**
 * 154 - Inheritance
 * 577 - Answer
 *
 * 24. What is the output of the following application?
 * package space;
 * interface Sphere {
 *  default String getName() { return "Unknown"; }
 * }
 * abstract class Planet {
 *  abstract String getName();
 * }
 * public class Mars extends Sphere implements Planet {
 *  public Mars() {
 *  super();
 *  }
 *  public String getName() { return "Mars"; }
 *  public static void main(final String[] probe) {
 *  System.out.print(((Planet)new Mars()).getName());
 *  }
 * }
 * A. Mars
 * B. Unknown
 * C. The code does not compile due to the declaration of Sphere.
 * D. The code does not compile for another reason
 */

public class Que24_Imp_Imp {
    public static void main(String[] args)
    {

    }
}
