package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 141 - MethodAndEncapsulation
 * 571 - Answer
 *
 * 44. How many final modifiers would need to be removed for this
 * application to compile?
 * package park;
 * public class Tree {
 *  public final static long numberOfTrees;
 *  public final double height;
 *  static {}
 *  { final int initHeight = 2;
 *  height = initHeight;
 *  }
 *  static {
 *  numberOfTrees = 100;
 *  height = 4;
 *  }
 * }
 * A. None
 * B. One
 * C. Two
 * D. The code will not compile regardless of the number of final
 * modifiers removed.
 *
 * 44. D. The last static initialization block accesses height, which is
 * an instance variable, not a static variable. Therefore, the code
 * will not compile no matter how many final modifiers are
 * removed, making Option D the correct answer. Note that if the
 * line height = 4; was removed, then no final modifiers would
 * need to be removed to make the class compile.
 */

public class Que44 {
    public static void main(String[] args) {
        
    }
}
