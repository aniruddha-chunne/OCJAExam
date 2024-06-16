package com.OCJA.chapter7_Inheritance;

/**
 * 150 - Inheritance
 * 575 - Answer
 *
 * 14. What is the output of the following application?
 * package track;
 * interface Run {
 *  default void walk() {
 *  System.out.print("Walking and running!");
 *  }
 * }
 * interface Jog {
 *  default void walk() {
 *  System.out.print("Walking and jogging!");
 *  }
 * }
 * public class Sprint implements Run, Jog {
 *  public void walk() {
 *  System.out.print("Sprinting!");
 *  }
 *  public static void main() {
 *  new Sprint().walk();
 *  }
 * }
 * A. Walking and running!
 * B. Walking and jogging!
 * C. Sprinting!
 * D. The code does not compile.
 *
 * C
 *
 * 14. C. Having one class implement two interfaces that both define
 * the same default method signature leads to a compiler error,
 * unless the class overrides the default method. In this case, the
 * Sprint class does override the walk() method correctly,
 * therefore the code compiles without issue, and Option C is
 * correct.
 */

public class Que14_Imp_Imp {
    public static void main(String[] args) {
        
    }
}
