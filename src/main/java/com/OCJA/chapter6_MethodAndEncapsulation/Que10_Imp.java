package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 126 - MethodAndEncapsulation
 * 563 - Answer
 *
 * 10. Which line of code, inserted at line p1, causes the application to
 * print 5?
 * package games;
 * public class Jump {
 *  private int rope = 1;
 *  protected boolean outside;
 *  public Jump() {
 *  // p1
 *  outside = true;
 *  }
 *  public Jump(int rope) {
 *  this.rope = outside ? rope : rope+1;
 *  }
 *  public static void main(String[] bounce) {
 *  System.out.print(new Jump().rope);
 *  }
 * }
 * A. this(4);
 * B. new Jump(4);
 * C. this(5);
 * D. rope = 4;
 *
 * 10. A. First off, all of the lines compile but they produce various
 * different results. Remember that the default initialization of a
 * boolean instance variable is false, making outside false at line
 * p1. Therefore, this(4) will cause rope to be set to 5, while
 * this(5) will cause rope to be set to 6. Since 5 is the number we
 * are looking for, Option A is correct, and Option C is incorrect.
 * Option B is incorrect. While the statement does create a new
 * instance of Jump, with rope having a value of 5, that instance is
 * nested and the value of rope does not affect the surrounding
 * instance of Jump that the constructor was called in. Option D is
 * also incorrect. The value assigned to rope is 4, not the target 5
 *
 */

public class Que10_Imp {
    public static void main(String[] args) {
        
    }
}
