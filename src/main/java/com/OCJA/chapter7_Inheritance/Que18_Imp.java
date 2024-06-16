package com.OCJA.chapter7_Inheritance;

/**
 * 151 - Inheritance
 * 756 - Answer
 *
 * 18. Which statement about the following class is correct?
 * package shapes;
 * abstract class Triangle {
 *  abstract String getDescription();
 * }
 * class RightTriangle extends Triangle {
 *  protected String getDescription() { return "rt"; } // g1
 * }
 * public abstract class IsoscelesRightTriangle extends
 * RightTriangle { // g2
 *  public String getDescription() { return "irt"; }
 *  public static void main(String[] edges) {
 *  final Triangle shape = new IsoscelesRightTriangle();
 * // g3
 *  System.out.print(shape.getDescription());
 *  }
 * }
 * A. The code does not compile due to line g1.
 * B. The code does not compile due to line g2.
 * C. The code does not compile due to line g3.
 * D. The code compiles and runs without issue.
 *
 * 18. C. The code does not compile, so Option D is incorrect. The
 * IsoscelesRightTriangle class is abstract; therefore, it cannot be
 * instantiated on line g3. Only concrete classes can be
 * instantiated, so the code does not compile, and Option C is the
 * correct answer. The rest of the lines of code compile without
 * issue. A concrete class can extend an abstract class, and an
 * abstract class can extend a concrete class. Also, note that the
 * override of getDescription() has a widening access modifier,
 * which is fine per the rules of overriding methods.
 */

public class Que18_Imp {
    public static void main(String[] args) {
        
    }
}
