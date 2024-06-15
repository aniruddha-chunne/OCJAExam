package com.OCJA.chapter6_MethodAndEncapsulation;

/**
 * 136 - MethodAndEncapsulation
 * 568 - Answer
 *
 * 32. How many lines of the following program contain compilation
 * errors?
 * package sky;
 * public class Stars {
 *  private int inThe = 4;
 *  public void Stars() {
 *  super();
 *  }
 *  public Stars(int inThe) {
 *  this.inThe = this.inThe;
 *  }
 *  public static void main(String[] endless) {
 *  System.out.print(new sky.Stars(2).inThe);
 *  }
 * }
 * A. None
 * B. One
 * C. Two
 * D. Three
 *
 * 32. B. The code does not compile, so Option A is incorrect. The class
 * contains two constructors and one method. The first method,
 * Stars(), looks a lot like a no-argument constructor, but since it
 * has a return value of void, it is a method, not a constructor.
 * Since only constructors can call super(), the code does not
 * compile due to this line. The only constructor in this class, which
 * takes an int value as input, performs a pointless assignment,
 * assigning a variable to itself. While this assignment has no
 * effect, it does not prevent the code from compiling. Finally, the
 * main() method compiles without issue since we just inserted the
 * full package name into the class constructor call. This is how a
 * class that does not use an import statement could call the
 * constructor. Since the method is in the same class, and therefore
 * the same package, it is redundant to include the package name
 * but not disallowed. Because only one line causes the class to fail
 * to compile, Option B is correct.
 */

public class Que32 {
    public static void main(String[] args)
    {

    }
}
