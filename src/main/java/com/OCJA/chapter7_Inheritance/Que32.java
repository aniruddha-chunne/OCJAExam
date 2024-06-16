package com.OCJA.chapter7_Inheritance;

/**
 * 158 - Inheritance
 * 579 - Answer
 *
 * 32. What is the output of the following application?
 * package flying;
 * class Rotorcraft {
 *  protected final int height = 5;
 *  abstract int fly();
 * }
 * public class Helicopter extends Rotorcraft {
 *  private int height = 10;
 *  protected int fly() {
 *  return super.height;
 *  }
 *  public static void main(String[] unused) {
 *  Helicopter h = (Helicopter)new Rotorcraft();
 *  System.out.print(h.fly());
 *  }
 * }
 * A. 5
 * B. 10
 * C. The code does not compile.
 * D. The code compiles but produces a ClassCastException at
 * runtime.
 *
 * 32. C. The application does not compile, but not for any reason
 * having to do with the cast in the main() method. The Rotorcraft
 * class includes an abstract method, but the class itself is not
 * marked abstract. Only interfaces and abstract classes can
 * include abstract methods. Since the code does not compile,
 * Option C is the correct answer
 */

public class Que32 {
    public static void main(String[] args) {
        
    }
}
